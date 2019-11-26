package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.SnackDao;
import beans.SnackDto;

@WebServlet(urlPatterns = "/member/edit.do")
public class EditServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1] 전송 파라미터 수신(no, name, price, stock)
			req.setCharacterEncoding("UTF-8");
			SnackDto dto = new SnackDto();
			dto.setNo(Integer.parseInt(req.getParameter("no")));
			dto.setName(req.getParameter("name"));
			dto.setPrice(Integer.parseInt(req.getParameter("price")));
			dto.setStock(Integer.parseInt(req.getParameter("stock")));
//			[2] 데이터베이스 처리
			SnackDao dao = new SnackDao();
			boolean result = dao.edit(dto);
			
//			[3] 페이지 이동처리
			if(result) {
				resp.sendRedirect("edit_success.jsp");
			}
			else {
				resp.sendRedirect("edit_fail.jsp");
			}
				
		} 
		catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
	
}
