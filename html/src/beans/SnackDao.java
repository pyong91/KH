package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SnackDao {

	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
	}

	public void insert(String name, int price) throws Exception {
		Connection con = getConnection();
		String sql = "insert into snack values(snack_seq.nextval, ?, ?, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, price);
		ps.execute();
		con.close();
	}

	public void insert(String name, int price, int stock) throws Exception {
		Connection con = getConnection();
		String sql = "insert into snack values(snack_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, price);
		ps.setInt(3, stock);
		ps.execute();
		con.close();
	}

	public void insert(SnackDto dto) throws Exception {
		Connection con = this.getConnection();

		String sql = "insert into snack values(snack_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getName());
		ps.setInt(2, dto.getPrice());
		ps.setInt(3, dto.getStock());

		ps.execute();

		con.close();
	}

//	기능4 : snack의 목록을 예쁘게 포장해서 반환하는 기능
	public List<SnackDto> getList() throws Exception {
		Connection con = this.getConnection();

		String sql = "select * from snack order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<SnackDto> list = new ArrayList<>();

//		데이터 1줄 가공
//		ResultSet의 데이터를 List<SnackDto> 형태로 변환
//		 -ResultSet은 연결 종료되면 사용이 불가능 하기 때문
		while (rs.next()) {
			SnackDto dto = new SnackDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setPrice(rs.getInt("price"));
			dto.setStock(rs.getInt("stock"));

			list.add(dto);
		}

		con.close();

		return list;
	}

	public List<SnackDto> search(String name) throws Exception {
		Connection con = this.getConnection();

		String sql = "select * from snack where name like ? order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%" + name + "%");
		ResultSet rs = ps.executeQuery();

		List<SnackDto> list = new ArrayList<>();

		while (rs.next()) {
			SnackDto dto = new SnackDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setPrice(rs.getInt("price"));
			dto.setStock(rs.getInt("stock"));

			list.add(dto);
		}

		con.close();

		return list;
	}

	public boolean edit(SnackDto dto) throws Exception {
		Connection con = getConnection();

		String sql = "update snack set name=?, price=?, stock=? where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getName());
		ps.setInt(2, dto.getPrice());
		ps.setInt(3, dto.getStock());
		ps.setInt(4, dto.getNo());

		int result = ps.executeUpdate();

		con.close();

		return result > 0;
	}

//	단일조회 가능
//	이름 : get
//	매개변수 : 번호(int)
//	반환형 : 과자정보(SnackDto)

	public SnackDto get(int no) throws Exception {
		Connection con = this.getConnection();

		String sql = "select * from snack where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		SnackDto dto;

		if (rs.next()) {
			dto = new SnackDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setPrice(rs.getInt("price"));
			dto.setStock(rs.getInt("stock"));
		} else {
			dto = null;
		}

		con.close();
		return dto;
	}

}