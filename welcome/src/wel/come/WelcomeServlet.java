package wel.come;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet; // 톰켓이 제공해주는 패키지
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	http://localhost:8080/welcome(패키지)/hello
@WebServlet(urlPatterns = "/hello") // 주소부여, 등록
public class WelcomeServlet extends HttpServlet {

//	구동
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		사용자가 요청했을 때 처리할 내용을 코드로 작성
//		System.out.println("hello");

//		화면에 출력을 하려면 resp라는 객체를 사용해야 한다(응답정보)
		resp.setCharacterEncoding("UTF-8");	// 문서 제작 인코딩 방식
		resp.setContentType("text/plain; charset=UTF-8"); // 문서 유형 + 해석 방식
		resp.getWriter().println("안녕하세요!");
		resp.getWriter().println("반갑습니다!");
		
	}
}
