package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test02 {
//	사용자에게 학생번호와 변경할 포인트를 입력받아 kh_member의 정보를 ㅜ정하도록 구현
//	단, 존재하지 않는 학생번호의 경우 사용자에게 없음을 출력하도록 구현
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생번호를 입력하세요");
		int no = sc.nextInt();
		System.out.println("포인트를 입력하세요");
		int point = sc.nextInt();
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		String url = "update kh_member set point = ? where no = ?";
		PreparedStatement ps = con.prepareStatement(url);
		
		ps.setInt(1, point);
		ps.setInt(2, no);
		
		int count = ps.executeUpdate();
		
		if(count > 0) {
			System.out.println("수정 완료");
		} else {
			System.out.println("대상이 없습니다");
		}
		
		con.close();
	}
}
