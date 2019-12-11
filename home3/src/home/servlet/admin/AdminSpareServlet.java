package home.servlet.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.util.StringUtil;

@WebServlet(urlPatterns = "/admin/spare.do")
public class AdminSpareServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1]수신(id)
			req.setCharacterEncoding("UTF-8");
			String id = req.getParameter("id");
			
//			[2]처리
//			 - 임시 비밀번호는 10자리로 생성(알파벳+숫자+특수문자)
//			 - 생선한 비밀번호를 해당 회원 정보로 업데이트
			String pw = StringUtil.generateRandomString(10);
			MemberDao dao = new MemberDao();
			dao.changePassword(id, pw);
			
			
//			[3]이동
//			resp.sendRedirect("spare_result.jsp?pw="+pw);
			req.getSession().setAttribute("pw", pw);
			resp.sendRedirect("spare_result.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
