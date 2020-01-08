package servlet;

import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/regist.do")
public class MemberRegistServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			MemberDto dto = new MemberDto();

			dto.setId(req.getParameter("id"));
			dto.setPw(req.getParameter("pw"));
			dto.setName(req.getParameter("name"));
			dto.setPost(req.getParameter("post"));
			dto.setBasic_addr(req.getParameter("basic_addr"));
			dto.setExtra_addr(req.getParameter("extra_addr"));
			dto.setPhone(req.getParameter("phone"));
			
			MemberDao dao = new MemberDao();
			
			if(dao.checkId(dto)) {	
				resp.sendRedirect(req.getContextPath() + "/member/regist.jsp?error");
			}
			else {
				dao.regist(dto);
				resp.sendRedirect(req.getContextPath() + "/member/login.jsp");
			}
		} 
//		catch (SQLIntegrityConstraintViolationException e) {
//			resp.sendRedirect("유니크위반시 실패 주소로 이동시킴");
//		}
		catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
