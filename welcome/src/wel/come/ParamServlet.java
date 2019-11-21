package wel.come;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	목표 사용자가 보내는 값(파라미터)을 해석할 수 있는 서블릿 구현
@WebServlet(urlPatterns = "/param")
public class ParamServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		https://www.genie.co.kr/search/searchMain?query=iu
//		https://www.genie.co.kr/search/searchMain?query=10cm
//		https://www.genie.co.kr/search/searchMain?query=heize	// 3개 모두 같은 페이지
//		'?' 분기점 url<-'?'->data(parameter)
		
//		이름을 정한다 : kh
		
		String kh = req.getParameter("kh");
		String test = req.getParameter("test");
		System.out.println("kh = " + kh);
		System.out.println("test = " + test);
	}
	
}
