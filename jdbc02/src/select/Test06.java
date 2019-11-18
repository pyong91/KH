package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test06 {
	public static void main(String[] args) throws Exception {
//		그룹 함수를 이용한 결과를 출력(예: count, sum, ...)
//		 - 결과가 어떤 일이 있어도 1줄

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		String sql = "select count(*) from snack";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		rs.next();

		int count = rs.getInt("count(*)");
		System.out.println(count);

		con.close();
	}
}
