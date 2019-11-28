package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;

@WebServlet(urlPatterns = "/member/find.do")
public class MemberFindServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String name = req.getParameter("name");
			String phone = req.getParameter("phone");
			
			MemberDao dao = new MemberDao();
			String id = dao.findId(name, phone);
			
			if(id == null) {
				resp.sendRedirect("find_result.jsp");
			}
			else {
				resp.sendRedirect("find_result.jsp?id="+id);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
