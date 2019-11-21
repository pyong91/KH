package wel.come;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/exchange")
public class ExchangeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain; charset=UTF-8");
		int won = Integer.parseInt(req.getParameter("dollor")) * 1178;
		resp.getWriter().println(won + "원 입니다.");
	}
}
