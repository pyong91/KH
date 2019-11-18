package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test02 {
	public static void main(String[] args) throws Exception{
//		kh_member 테이블의 모든 데이터 정보를 화면에 출력
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		String sql = "select * from kh_member";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt("no") + " ");
			System.out.print(rs.getString("name") + " ");
			System.out.print(rs.getString("id") + " ");
			System.out.print(rs.getString("pw") + " ");
			System.out.print(rs.getInt("point") + " ");			
			System.out.println(rs.getDate("joindate"));			
		}
		
		con.close();
		
	}
}
