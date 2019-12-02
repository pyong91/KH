package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

//	필터(Filter)
//	[1] 상속받기 (javax.servlet.Filter)
//	[2] 주소를 등록한다
//		 - 주소를 만드는 것이 아니라 기존에 있는 주소를 검사
//	[3] 메소드를 구현한다(doFilter)
//@WebFilter(urlPatterns = "/index.jsp")
public class TestFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, // 요청 상위 객체
						ServletResponse response,//	응답 상위 객체 
						FilterChain chain)		 // 체인 정보 객체
			throws IOException, ServletException {
		System.out.println("테스트 필터 실행중!");
//		통과 명령
		chain.doFilter(request, response);
		
//		강제이동 명령
//		 - sendRedirect는 HTTP 통신에만 존재(다른 방식에는 없음)
//		 - HttpServletResponse에만 존재하는 기능
//		 - 다운 캐스팅 후 사용 가능
//		 - request도 이렇게 사용 가능
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.sendRedirect("/home/member/login.jsp");
//		resp.sendError(403);
	}
}

//	[1] 인코딩 필터
//		 - req.setCharacterEncoding 쓰기 귀찮아요
//		 - 차단용이라기보다는 도우미와 같은 역할
//	[2] 로그인 필터
//		 - 비회원이 회원기능에 접근하는 것을 차단
//		 - 만약 접근한다면 로그인 화면으로 redirect
//	[3] 관리자 필터
//		 - 관리자만 관리자 기능에 접근할 수 있도록 설정
//		 - 만약 권한 없는 사용자가 접근한다면 오류메시지를 출력(403)