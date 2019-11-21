package wel.come;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway")
public class SubwayServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain; charset=UTF-8");

		String strYear = req.getParameter("year");
		int year = Integer.parseInt(strYear);
		int age = Calendar.getInstance().get(Calendar.YEAR) - year + 1;

		boolean isAdult = age >= 20 && age <= 64;
		boolean isTeen = age >= 14 && age <= 19;
		boolean isChild = age >= 8 && age <= 13;
		boolean isBaby = age <= 7;

		resp.getWriter().println("나이 : " + age);
		if (isAdult) {
			resp.getWriter().print("성인 요금 1,250원입니다.");
		} 
		else if (isTeen) {
			resp.getWriter().print("청소년 요금 720원입니다.");
		} 
		else if (isChild) {
			resp.getWriter().print("어린이 요금 450원입니다.");
		} 
		else if (isBaby) {
			resp.getWriter().print("유아 요금 무료입니다.");
		} 
		else {
			resp.getWriter().print("노약자 요금 무료입니다.");
		}

	}
}
