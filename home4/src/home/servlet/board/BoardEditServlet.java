package home.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/edit.do")
public class BoardEditServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String head = req.getParameter("head");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String id = (String)req.getSession().getAttribute("id");
			int no = Integer.parseInt(req.getParameter("no"));
			BoardDto dto = new BoardDto();
			BoardDao dao = new BoardDao();
			dto.setHead(head);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(id);
			dto.setNo(no);
			dao.edit(dto);
			resp.sendRedirect("content.do?no="+dto.getNo());
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
