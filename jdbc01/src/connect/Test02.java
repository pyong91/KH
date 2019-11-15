package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test02 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe", "sample", "sample");
		
		// DB에 명령을 전달하고 싶다면 이 사이에서 수행
		
		con.close();
	}
}
