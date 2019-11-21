package wel.come;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/random")
public class RandomServlet extends HttpServlet {	
//	사용자가 다음 주소로 접속하면 랜덤으로 로또번호 한 개를 출력하는 페이지를 구현
//	http://localhost:8080/welcom/random
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random r = new Random();
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain; charset=UTF8");
		resp.getWriter().println(r.nextInt(45)+1 + "번이 나왔습니다");
		
	}
}
