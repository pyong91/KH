package home.servlet.board;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import home.beans.BoardDao;
import home.beans.BoardDto;
import home.beans.FilesDao;
import home.beans.FilesDto;

@WebServlet(urlPatterns = "/board/write.do")
public class BoardWriteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			multipart/form-data 로 전송되는 데이터를 수신하도록 코드를 작성
//			 - cos.jar 필요
//			 - 저장 위치 : D:/upload/home
//			 - 용량 제한 : 10MB
//			 - 인코딩 방식 : UTF-8
			MultipartRequest mRequest = new MultipartRequest(req, "D:/upload/home", 10 * 1024 * 1024, "UTF-8",
					new DefaultFileRenamePolicy());

			BoardDto dto = new BoardDto();
			BoardDao dao = new BoardDao();

//			추가되는 내용
//			 - 답글일 경우에는 파라미터에 no가 추가된다.
//			 - no가 있다면 받아서 해당글의 정보를 불러온 뒤 dto에 설정한다.
			if (mRequest.getParameter("superno") != null) {
				int superno = Integer.parseInt(mRequest.getParameter("superno"));
				BoardDto target = dao.getInfo(superno);
				dto.setSuperno(target.getNo());
				dto.setGroupno(target.getGroupno());
				dto.setDepth(target.getDepth());
			}

			String head = mRequest.getParameter("head");
			String title = mRequest.getParameter("title");
			String content = mRequest.getParameter("content");

			String id = (String) req.getSession().getAttribute("id");

			dto.setHead(head);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(id);
			dto.setNo(dao.getSequence());

			dao.write(dto);

//			* 파일이 있을 때만 *
//			게시글 등록을 마친 뒤에 "파일 등록"을 진행
			File file = mRequest.getFile("file");
			if (file != null) {
				FilesDto fdto = new FilesDto();
				fdto.setOrigin(dto.getNo());
				fdto.setUploadName(mRequest.getOriginalFileName("file"));//업로드이름
				fdto.setSaveName(mRequest.getFilesystemName("file"));	//실저장이름
				fdto.setFileSize(file.length());
				fdto.setFileType(mRequest.getContentType("file"));		//파일유형
				
				FilesDao fdao = new FilesDao();
				fdao.insert(fdto);
			}

			resp.sendRedirect("content.jsp?no=" + dto.getNo());
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

	}
}
