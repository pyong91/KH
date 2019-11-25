package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;

@WebServlet(urlPatterns = "/insert2/regist.do")
public class RegistServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			KHMemberDao dao = new KHMemberDao();
			String name = req.getParameter("name");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			dao.insertMember(name, id, pw);
			
			resp.sendRedirect("/html/insert2/regist_result.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
