package home.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;
import home.controller.Controller;

public class MemberLoginController implements Controller{
	@Override
	public String doGet(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		return "redirect:/index.do";
	}
	
	@Override
	public String doPost(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		resp.setCharacterEncoding("UTF-8");
		MemberDto dto = new MemberDto();
		MemberDao dao = new MemberDao();
		dto.setId(req.getParameter("id"));
		dto.setPw(req.getParameter("pw"));

		if (dao.login(dto)) { // 로그인 성공
			dto = dao.getInfo(req.getParameter("id"));
//				session에 아이디와 권한을 저장
			req.getSession().setAttribute("id", dto.getId());
			req.getSession().setAttribute("grade", dto.getGrade());

//				추가 : 사용자의 최종 로그인 시간 업데이트
			dao.updateLastLogin(dto.getId());

			return "redirect:/index.do";
		} else { // 로그인 실패
			resp.sendRedirect("login.do?error");
			return null;
		}
	}
}
