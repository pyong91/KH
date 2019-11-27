package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/login.do")
public class MemberLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setCharacterEncoding("UTF-8");
			MemberDto dto = new MemberDto();
			dto.setId(req.getParameter("id"));
			dto.setPw(req.getParameter("pw"));
			
			MemberDao dao = new MemberDao();
			if(dao.login(dto)) {
//				resp.sendRedirect("/home");
//				resp.sendRedirect("/home/index.jsp");
				resp.sendRedirect(req.getContextPath());
			} else {
//				resp.sendRedirect("/home/member/login_fail.jsp");
//				resp.sendRedirect(req.getContextPath() + "/member/login.jsp");
//				error 메시지가 표시되는 로그인 화면으로 이동해라
				resp.sendRedirect(req.getContextPath() + "/member/login.jsp?error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
