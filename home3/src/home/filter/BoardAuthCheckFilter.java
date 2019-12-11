package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import home.beans.BoardDao;
import home.beans.BoardDto;

public class BoardAuthCheckFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
//		목표 : 관리자이거나 본인글인 경우만 통과시키고 나머지는 403 송출
//		대상 : 게시글 수정, 삭제
//		특징 : 반드시 파라미터에 no가 존재한다
//		계획
//		 - 파라미터에 no를 꺼내서 게시글 정보를 불러오고 세션에서 사용자 정보를 불러온다
//		 - 검사후 통과/거절을 결정
		
		try {
			HttpServletRequest req = (HttpServletRequest)request;
			HttpServletResponse resp = (HttpServletResponse)response;
			HttpSession session = req.getSession();
			
			int no = Integer.parseInt(req.getParameter("no"));
			
			BoardDao dao = new BoardDao();
			BoardDto dto = dao.getInfo(no);
			
//			관리자인지 또는 내글인지 파악
			String id = (String)session.getAttribute("id");
			String grade = (String)session.getAttribute("grade");
			
//			사용자 아이디 == 작성자 아이디
			boolean isMine = id.equals(dto.getWriter());
			boolean isAdmin = grade.equals("관리자");
			
			if (isAdmin || isMine) {
				chain.doFilter(request, response);
			} else {
				resp.sendError(403);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
