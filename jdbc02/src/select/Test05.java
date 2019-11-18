package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws Exception{
//		해당하는 검색어가 이름, 아이디 중 하나에 포함되어 있는 결과를 출력
		
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String keyword = sc.next();
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
//		1.
//		String sql = "select * from kh_member where name like '%'||?||'%'";
//		2.
//		String sql = "select * from kh_member where name like '%"+"?"+"%'";
//		3.
		String sql = "select * from kh_member where name like ?";
		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%"+keyword+"%");
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
