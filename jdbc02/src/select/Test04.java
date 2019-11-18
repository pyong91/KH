package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws Exception {
//		kh_member 테이블에서 원하는 이름에 해당하는 정보를 화면에 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String keyword = sc.next();
		sc.close();

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		String sql = "select * from kh_member where name = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {
			System.out.print(rs.getInt("no") + " ");
			System.out.print(rs.getString("name") + " ");
			System.out.print(rs.getString("id") + " ");
			System.out.print(rs.getString("pw") + " ");
			System.out.print(rs.getInt("point") + " ");
			System.out.println(rs.getDate("joindate"));
			count++;
		}
		if(count == 0) {
			System.out.println("결과없음");
		}

		con.close();

	}
}
