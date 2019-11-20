package product.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {

	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		return con;
	}

	public void insertProduct(String name, String type, int price) throws Exception {
		Connection con = this.getConnection();
		String sql = "insert into product values(product_seq.nextval, ?, ?, ?, 0, sysdate)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, type);
			ps.setInt(3, price);
			ps.execute();
			con.close();
			System.out.println("등록 완료");
		} catch (SQLException e) {
			System.out.println("잘못입력하셨습니다");
		}

	}

	public void printList() throws Exception {
		Connection con = this.getConnection();
		String sql = "select * from product";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		System.out.println("제품번호\t제품명\t제품종류\t제품가격\t누적판매\t등록일");
		while(rs.next()) {
			System.out.print(rs.getInt("serial") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getString("type") + "\t");
			System.out.print(rs.getInt("price") + "\t");
			System.out.print(rs.getInt("acc") + "\t");
			System.out.println(rs.getString("reg").substring(0, 10) + "\t");
		}
	}
}
