package home.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/write.do")
public class BoardWriteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			BoardDto dto = new BoardDto();
			BoardDao dao = new BoardDao();
			
//			추가되는 내용
//			 - 답글일 경우에는 파라미터에 no가 추가된다.
//			 - no가 있다면 받아서 해당글의 정보를 불러온 뒤 dto에 설정한다.
			if(req.getParameter("superno")!=null) {
				int superno = Integer.parseInt(req.getParameter("superno"));
				BoardDto target = dao.getInfo(superno);
				dto.setSuperno(target.getNo());
				dto.setGroupno(target.getGroupno());
				dto.setDepth(target.getDepth());
			}
			
			String head = req.getParameter("head");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			
			String id = (String)req.getSession().getAttribute("id");
			
			dto.setHead(head);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(id);
			dto.setNo(dao.getSequence());
			
			dao.write(dto);
			resp.sendRedirect("content.jsp?no="+dto.getNo());
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
