package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebFilter(urlPatterns = {"/member/info.jsp", "/member/check_pw.jsp?go=/member/change_pw.jsp", 
//							"/member/change_pw.jsp", "/member/change_pw_result.jsp",
//							"/member/check_pw.jsp?go=/member/change_info.jsp",
//							"/member/change_info.jsp"})
//@WebFilter(urlPatterns = "/admin/*")
public class LoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		String id = (String)req.getSession().getAttribute("id");

		if (id != null) { // 회원
			chain.doFilter(request, response);
		} else { // 비회원
			HttpServletResponse resp = (HttpServletResponse) response;
			resp.sendRedirect(req.getContextPath()+"/member/login.jsp");
		}
	}
}

// - 비회원
// /index.jsp
// /member/regist.jsp
// /member/login.jsp
// /member/find.jsp



// - 회원
// /member/info.jsp
// /member/check_pw.jsp?go=/member/change_pw.jsp
// /member/change_pw.jsp
// /member/change_pw_result.jsp
// /member/check_pw.jsp?go=/member/change_info.jsp
// /member/change_info.jsp