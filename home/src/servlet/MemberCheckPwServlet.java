package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;

@WebServlet(urlPatterns = "/member/check_pw.do")
public class MemberCheckPwServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1] 수신
			String id = (String)req.getSession().getAttribute("id");
			String pw = req.getParameter("pw");
			String go = req.getParameter("go");
			
//			[2] 처리
			MemberDao dao = new MemberDao();
			boolean result = dao.login(id, pw);
			
//			[3] 이동
			if(result) { // 성공시
				resp.sendRedirect(req.getContextPath() + go);
			}
			else { // 실패시
				resp.sendRedirect("check_pw.jsp?error");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
