package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제품명 입력해라");
		String str = sc.next();
		System.out.println("가격을 입력해라");
		int price = sc.nextInt();
		System.out.println("수량을 입력해라");
		int qtt = sc.nextInt();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe", "sample", "sample");
		
//		DB에 명령을 전달하고 싶다면 이 사이에서 수행
//		insert into snack(no, name, price, stock) values(5, '허니버터칩', 2000, 10) 세미콜론 빼고
		String sql = "insert into snack(no, name, price, stock) "
				+ "values(snack_seq.nextval," + " '"+ str +"', " + price + ", " + qtt + ")";

		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.execute();
		
		con.close();
		System.out.println("등록완료");
		
	}
}
