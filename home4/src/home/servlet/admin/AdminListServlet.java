package home.servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/admin/list.do")
public class AdminListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 필요한 데이터를 불러오기 위한 자바 코드 작업
			//  - 관리자가 회원을 검색하기 위한 페이지이므로 검색기능만 구현
			//  - 검색어가 없으면 빈 페이지 출력
			// [1] 검색어 받기(type, keyword)
			String type = req.getParameter("type");
			String keyword = req.getParameter("keyword");
			
			// [2] 검색인지 아닌지 판정
//		 	boolean isSearch = type도 있고 keyword도 있으면;
			boolean isSearch = type != null && keyword != null;
			
			// [3] 처리
			MemberDao dao = new MemberDao();
			List<MemberDto> list;
			if(isSearch){
				list = dao.search(type, keyword);
			}
			else{
				list = null;
			}
			
			// 이어지는 작업
			// -list.jsp로 포워딩 + 데이터 첨부(list)
			req.setAttribute("list", list);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/list.jsp");
			dispatcher.forward(req, resp);
			
		} catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
