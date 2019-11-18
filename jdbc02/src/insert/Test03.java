package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 아이디 비밀번호 포인트 입력");
		String name = sc.next();
		String id = sc.next();
		String pwd = sc.next();
		int point = sc.nextInt();
		String joindate = sc.next();
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		String sql = "insert into kh_member values(kh_member_seq.nextval, ?, ?, ?, ?, to_date(?, 'YYYY-MM-DD'))";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, name);
		ps.setString(2, id);
		ps.setString(3, pwd);
		ps.setInt(4, point);
		ps.setString(5, joindate);
		
		ps.execute();
		con.close();
		System.out.println("처리완료");
	}
}
