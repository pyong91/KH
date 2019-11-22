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

//	사용자의 요청을 받으면 kh_member 테이블 목록을 검색하여 번호순으로 정렬하여 출력하도록 구현

@WebServlet(urlPatterns = "/kh_search")
public class KHSearchServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			KHMemberDao dao = new KHMemberDao();
			List<KHMemberDto> list = dao.search(req.getParameter("name"));
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/plain; charset=UTF-8");
			for(KHMemberDto dto : list) {
				resp.getWriter().println(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

	}

}
