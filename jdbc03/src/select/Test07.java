package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test07 {
//	작업자 연봉 평균 출력
	
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		String sql = "select round(avg(salary),2) from employees";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		rs.next();

//		double avg = rs.getDouble(1);
		double avg = rs.getDouble("round(avg(salary),2)");
		System.out.println(avg);

		con.close();
		System.out.println("처리완료");
//		select round(avg(salary),2) from employees;
	}
}
