package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args) throws Exception{
//		목표 : snack 테이블에서 처음처럼의 가격을 1700원으로 수정
//		명령 : update snack set price = 1700 where name = '처음처럼';
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sample" , "sample");
		
		String sql = "update snack set price = 1500 where name = '허니버터칩'";
		PreparedStatement ps = con.prepareStatement(sql);
		
//		실행
//		ps.execute(); 이 방법으론 결과를 알 수 없다(성공/실패)
		int count = ps.executeUpdate();  // 실행 후 성공 행의 개수를 가져오는 명령
		
		System.out.println("count = " + count);
		con.close();
		System.out.println("처리완료");
		
//		count의 값에 따라 성공인지 실패인지를 판정할 수 있다
		if(count > 0) {
			System.out.println("수정 성공");
		} else {
			System.out.println("대상이 없습니다");
		}
	}
}
