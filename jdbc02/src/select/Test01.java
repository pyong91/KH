package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test01 {
	public static void main(String[] args) throws Exception{
//		목표 : snack 테이블의 모든 정보를 화면에 출력
//		명령 : select * from snack;
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample" ,"sample");
		String sql = "select * from snack";
		PreparedStatement ps = con.prepareStatement(sql);
		
//		ps.execute();
//		select는 다음 명령을 사용한다.
		ResultSet rs = ps.executeQuery();
		
//		rs의 명령
//		1. .next() 		다음 줄로 이동하여 데이터 유무를 반환
//		2. .get...() 	현재 위치에서 데이터를 추출
		rs.next();
		int no = rs.getInt("no");
		System.out.println(no);
		String name = rs.getString("name");
		System.out.println(name);
		
		
		
		con.close();
		System.out.println("실행완료");
		
	}
}
