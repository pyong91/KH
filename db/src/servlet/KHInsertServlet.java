package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;

@WebServlet(urlPatterns = "/kh_insert")
public class KHInsertServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			KHMemberDao dao = new KHMemberDao();
			String name = req.getParameter("name");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			dao.insertMember(name, id, pw);
			
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/plain; charset=UTF-8");
			resp.getWriter().println("완료");
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
