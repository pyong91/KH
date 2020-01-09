package home.servlet.board;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;
import home.beans.FilesDao;
import home.beans.FilesDto;
import home.beans.ReplyDao;
import home.beans.ReplyDto;

@WebServlet(urlPatterns = "/board/content.do")
public class BoardContentServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1]번호 받기 [2]조회수 증가시키고 게시글 불러오기 [3]출력
			int no = Integer.parseInt(req.getParameter("no"));
			BoardDao bdao = new BoardDao();
			BoardDto bdto = bdao.getInfo(no);
			
			String userId = (String)req.getSession().getAttribute("id");
			String grade = (String)req.getSession().getAttribute("grade");
			
			boolean isMine = userId.equals(bdto.getWriter()); // 사용자ID == 작성자ID
			boolean isAdmin = grade.equals("관리자");
			
//			추가 : Set<Integer> 형태의 저장소를 이용하여 이미 읽은 글은 조회수 증가를 방지
//			[1] 세션에 있는 저장소를 꺼내고 없으면 생성한다
			Set<Integer> memory = (Set<Integer>)req.getSession().getAttribute("memory");
			// memory가 없는 경우에는 null 값을 가진다
			
			if(memory == null){
				memory = new HashSet<>();
			}
//			[2] 처리를 수행한다	
			boolean isFirst = memory.add(no);

//			처리를 마치고 저장소를 다시 세션에 저장한다	
			req.getSession().setAttribute("memory", memory); // 세션에 셋 저장
			
//			내글이아니면 ==!isMine	
//			처음읽는글이면 == isFirst
			if(!isMine && isFirst){
				bdto.setReadCount(bdto.getReadCount()+1);
				bdao.readCountPlus(no);
			}
			
//		 	댓글
			ReplyDao dao = new ReplyDao();
			List<ReplyDto> list = dao.getList(no);
			
//		 	파일
			FilesDao fdao = new FilesDao();
			List<FilesDto> flist = fdao.getList(no);
			
			req.setAttribute("isMine", isMine);
			req.setAttribute("isAdmin", isAdmin);
			req.setAttribute("bdto", bdto);
			req.setAttribute("list", list);
			req.setAttribute("flist", flist);
			req.setAttribute("no", no);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/board/content.jsp");
			dispatcher.forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
