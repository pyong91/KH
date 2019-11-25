package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;

@WebServlet(urlPatterns = "/member/login.do")
public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			KHMemberDao dao = new KHMemberDao();
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			boolean isLogin = dao.login(id, pw);
			if(isLogin) {
				resp.sendRedirect("/html/member/login_success.jsp");
			} else {
				resp.sendRedirect("/html/member/login_fail.jsp");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
