package home.servlet.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/list.do")
public class BoardListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			// 페이징 추가
			
			// 페이지크기
			int pagesize = 10;
			// 네비게이터 크기
			int navsize = 10;
			
			int pno;
			try{
				pno = Integer.parseInt(req.getParameter("pno"));
				if(pno <= 0) throw new Exception();
			}
			catch(Exception e){
				pno = 1;
			}

			
			int finish = pno * pagesize;
			int start = finish - (pagesize - 1);
				
			String type = req.getParameter("type");
			String keyword = req.getParameter("keyword");
			
			boolean isSearch = type != null && keyword != null;
			
			List<BoardDto> list;
			BoardDao dao = new BoardDao();

			if(isSearch){
				list = dao.search(type, keyword, start, finish);
			} else {
				list = dao.getList(start, finish);
			}
			/***************************************************
				하단 네비게이터 계산하기
				 - 시작블록 = (현재페이지-1) / 네비게이터크기 * 네비게이터크기 + 1
			***************************************************/
			int count = dao.getCount(type, keyword);
			
			req.setAttribute("list", list);
			req.setAttribute("pno", pno);
			req.setAttribute("count", count);
			req.setAttribute("navsize", navsize);
			req.setAttribute("pagesize", pagesize);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/board/list.jsp");
			dispatcher.forward(req, resp);
			
			
		} catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
