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

@WebServlet(urlPatterns = "/kh_list")
public class KHListServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			KHMemberDao dao = new KHMemberDao();
			List<KHMemberDto> list = dao.getKHMember();
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/plain; charset=UTF-8");
			
			for (KHMemberDto dto : list) {
				resp.getWriter().println(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

	}

}
