package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SnackDao {

	public Connection getConnection() throws Exception{
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample","sample");
		return con;
	}
	
	public void insert(String name, int price) throws Exception{
		Connection con = getConnection();
		String sql = "insert into snack values(snack_seq.nextval, ?, ?, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, price);
		ps.execute();
		con.close();
	}
	
	public void insert(String name, int price, int stock) throws Exception{
		Connection con = getConnection();
		String sql = "insert into snack values(snack_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, price);
		ps.setInt(3, stock);
		ps.execute();
		con.close();
	}
}
