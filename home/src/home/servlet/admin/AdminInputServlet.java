package home.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/admin/input.do")
public class AdminInputServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");

			MemberDto dto = new MemberDto();
			dto.setId(req.getParameter("id"));
			dto.setName(req.getParameter("name"));
			dto.setPost(req.getParameter("post"));
			dto.setBasic_addr(req.getParameter("basic_addr"));
			dto.setExtra_addr(req.getParameter("extra_addr"));
			dto.setPhone(req.getParameter("phone"));
			dto.setGrade(req.getParameter("grade"));
			dto.setPoint(Integer.parseInt(req.getParameter("point")));

			MemberDao dao = new MemberDao();
			dao.adminChangeInfo(dto);

			resp.sendRedirect(req.getContextPath()+"/admin/detail.jsp?id="+dto.getId());
		} 
		catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
