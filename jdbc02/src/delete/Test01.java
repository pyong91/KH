package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args) throws Exception{
//		목표 : 번호를 이용하여 kh_member의 데이터를 삭제하는 것
//		 - 일반적으로는 삭제는 PK(기본키)에 의해 이루어진다.
//		 - 수정과 동일한 코드 방식을 사용(결과 행 개수를 알아야 함)
		
		int no = 1;
		
//		DB 처리
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		String sql = "delete kh_member where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		
		int count = ps.executeUpdate();
		con.close();
		
		if(count>0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("대상이 없습니다.");
		}
	}
}
