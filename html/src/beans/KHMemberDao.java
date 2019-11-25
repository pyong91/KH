package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.SnackDto;

public class KHMemberDao {

	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		return con;
	}

	public void insertMember(String name, String id, String pw) throws Exception {
		Connection con = this.getConnection();
		String sql = "insert into kh_member values(kh_member_seq.nextval, ?, ?, ?, 0, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, name);
		ps.setString(2, id);
		ps.setString(3, pw);

		ps.execute();

		con.close();
	}

	public List<KHMemberDto> getKHMember() throws Exception {
		Connection con = this.getConnection();
		List<KHMemberDto> list = new ArrayList<>();
		String sql = "select * from kh_member order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			KHMemberDto dto = new KHMemberDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setPoint(rs.getInt("point"));
			dto.setJoinDate(rs.getString("joindate"));

			list.add(dto);
		}
		return list;
	}

	public List<KHMemberDto> search(String name) throws Exception {
		Connection con = this.getConnection();
		String sql = "select * from kh_member where name like ? order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%" + name + "%");
		ResultSet rs = ps.executeQuery();

		List<KHMemberDto> list = new ArrayList<>();

		while (rs.next()) {
			KHMemberDto dto = new KHMemberDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setPoint(rs.getInt("point"));
			dto.setJoinDate(rs.getString("joindate"));

			list.add(dto);
		}

		con.close();

		return list;
	}

	public boolean login(String id, String pw) throws Exception {
		Connection con = this.getConnection();
		String sql = "select * from kh_member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ResultSet rs = ps.executeQuery();	
		boolean res = rs.next();
		con.close();
		return res;
	}
	
	public void changePassword(String pw, String id) throws Exception {
		Connection con = this.getConnection();
		String sql = "update kh_member set pw = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,	pw);
		ps.setString(2,	id);
		ps.execute();
		con.close();
	}
	
	public boolean changePassword(String id, String pw, String new_pw) throws Exception {
		Connection con = this.getConnection();
		String sql = "update kh_member set pw = ? where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,	new_pw);
		ps.setString(2,	id);
		ps.setString(3, pw);
		int count = ps.executeUpdate();
		con.close();
		
		return count > 0;
	}
	
	public void exit(String id) throws Exception {
		Connection con = this.getConnection();
		String sql = "delete kh_member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.execute();
		con.close();
	}
}
