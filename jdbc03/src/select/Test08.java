package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test08 {
	public static void main(String[] args) throws Exception {

//		작업자 직업별 연봉평균 출력
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		String sql = "select jobs.job_title, avg(salary) "
						+ "from employees inner join jobs on employees.job_id = jobs.job_id group by jobs.job_title";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			System.out.print(rs.getString("job_title")+" ");
			System.out.println(rs.getDouble("avg(salary)"));
		}

		con.close();
		System.out.println("처리완료");
		
//	select
//	    jobs.job_title, avg(salary)
//	from employees
//	    inner join jobs on employees.job_id = jobs.job_id
//	group by jobs.job_title;
	}
}
