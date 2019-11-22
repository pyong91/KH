package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;
import beans.KHMemberDto;

@WebServlet(urlPatterns = "/kh_login")
public class KHLoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			KHMemberDao dao = new KHMemberDao();
			boolean result = dao.login(req.getParameter("id"),req.getParameter("pw"));
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/plain; charset=UTF-8");
			if(result) resp.getWriter().println("로그인 성공");
			else resp.getWriter().println("로그인 실패");
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
