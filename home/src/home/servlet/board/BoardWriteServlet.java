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
			String head = req.getParameter("head");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String writer = req.getParameter("id");
			BoardDto dto = new BoardDto();
			dto.setHead(head);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(writer);

			BoardDao dao = new BoardDao();

			dao.write(dto);
			resp.sendRedirect("list.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
