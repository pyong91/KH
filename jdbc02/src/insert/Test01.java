package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args) throws Exception{
//		C(insert) 코드 작성
		
		String name = "허니버터칩";
		int price = 2000;
		int stock = 25;
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
//		이제부터는 명령에서 채워줘야할 데이터가 있는 자리는 ?로 처리한다
//		주의 : 이제부터는 명령의 완성형태를 볼 수 없다
		String sql = "insert into snack values(snack_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name); // 1번 물음표에 String 형태로 name 넣고 따옴표 추가
		ps.setInt(2, price);
		ps.setInt(3, stock);
		
		ps.execute();
		
		con.close();
		System.out.println("처리완료");
	}
}
