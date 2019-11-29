package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;

@WebServlet(urlPatterns = "/member/exit.do")
public class MemberExitServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setCharacterEncoding("UTF-8");
			String id = (String) req.getSession().getAttribute("id");

			req.getSession().removeAttribute("id");
			req.getSession().removeAttribute("grade");
			
			MemberDao dao = new MemberDao();
			dao.exit(id);

			resp.sendRedirect(req.getContextPath() + "/member/exit_result.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

	}
}
