package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String event = sc.next();
		int gold = sc.nextInt();
		int silver = sc.nextInt();
		int bronze = sc.nextInt();
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		String sql = "insert into sports_player values(sports_player_seq.nextval, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, name);
		ps.setString(2, event);
		ps.setInt(3, gold);
		ps.setInt(4, silver);
		ps.setInt(5, bronze);
		
		ps.execute();
		con.close();
		System.out.println("처리완료");
	}
}
