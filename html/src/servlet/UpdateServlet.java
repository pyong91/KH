package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;

@WebServlet(urlPatterns = "/member/update.do")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			KHMemberDao dao = new KHMemberDao();
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			String new_pw = req.getParameter("new_pw");
			
			boolean result = dao.changePassword(id, pw, new_pw);
			if(result) {
				resp.sendRedirect("http://localhost:8080/html/member/update_success.jsp");
			} else {
				resp.sendRedirect("http://localhost:8080/html/member/update_fail.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

	}
}
