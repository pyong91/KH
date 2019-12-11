package home.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.ReplyDao;
import home.beans.ReplyDto;

@WebServlet(urlPatterns = "/board/reply_insert.do")
public class BoardReplyWriteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String content = req.getParameter("content");
			String writer = (String)req.getSession().getAttribute("id");
			int origin = Integer.parseInt(req.getParameter("origin"));

			ReplyDto dto = new ReplyDto();
			ReplyDao dao = new ReplyDao();

			dto.setReply_no(dao.getSequence());
			dto.setContent(content);
			dto.setWriter(writer);
			dto.setOrigin(origin);

			dao.write(dto);
			BoardDao bdao = new BoardDao();
			bdao.replyCountPlus(origin);
			resp.sendRedirect("content.jsp?no=" + origin);
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
