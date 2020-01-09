package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/info.do")
public class MemberInfoServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		resp.setCharacterEncoding("UTF-8");
			
		// 회원 정보를 불러오는 코드
		// 1. session에서 id에 들어있는 데이터를 꺼낸다
		// 2. id를 주고 dao를 이용해 회원정보(MemberDto)를 꺼낸다
		// 3. 원하는 위치에 출력
		
		String id = (String)req.getSession().getAttribute("id");
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.getInfo(id);
		
		req.setAttribute("dto", dto);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/member/info.jsp");
		dispatcher.forward(req, resp);
		
		} catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
