package home.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.ReplyDao;

@WebServlet(urlPatterns = "/board/reply_delete.do")
public class BoardReplyDeleteServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int reply_no = Integer.parseInt(req.getParameter("reply_no"));
			int origin = Integer.parseInt(req.getParameter("origin"));
			ReplyDao rdao = new ReplyDao();
			BoardDao bdao = new BoardDao();
			rdao.delete(reply_no);
			bdao.replyCountMinus(origin);
			
			resp.sendRedirect("content.do?no="+origin);
		}
		catch(Exception e){
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
