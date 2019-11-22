package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.SnackDao;
import beans.SnackDto;

@WebServlet(urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		try {
			SnackDao dao = new SnackDao();
			List<SnackDto> list = dao.search(req.getParameter("name"));
			
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/plain; charset=UTF-8");
			for(SnackDto dto : list) {
				resp.getWriter().println(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
