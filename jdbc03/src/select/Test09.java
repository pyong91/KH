package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");

//		String sql = "select count(*) from kh_member where id = ? and pw = ?";
		String sql = "select * from kh_member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("id를 입력하세요");
		String user_id = sc.next();
		System.out.println("password를 입력하세요");
		String user_pw = sc.next();
		sc.close();
		ps.setString(1, user_id);
		ps.setString(2, user_pw);

		ResultSet rs = ps.executeQuery();

//		rs.next();
//		if (rs.getInt("count(*)") == 1) {
		
		boolean result = rs.next();
		if(result) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		con.close();
	}

//	select
//	    count(*)
//	from
//	    kh_member
//	where
//	    id = 'vydnjfdyd' and pw = 'vydnjfdyd';
}
