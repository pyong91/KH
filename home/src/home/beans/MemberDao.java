package home.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {

//	연결 메소드
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "home", "home");
	}

	public boolean login(String id, String pw) throws Exception {
		Connection con = this.getConnection();
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ResultSet rs = ps.executeQuery();
		boolean result = rs.next();
		con.close();
		return result;
	}

	public boolean login(MemberDto dto) throws Exception {
		return this.login(dto.getId(), dto.getPw());
	}

	public void regist(MemberDto dto) throws Exception {
		Connection con = this.getConnection();
		String sql = "insert into member values(?, ?, ?, sysdate, '일반회원', 0, ?, ?, ?, ?, null)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getPost());
		ps.setString(5, dto.getBasic_addr());
		ps.setString(6, dto.getExtra_addr());
		ps.setString(7, dto.getPhone());
		ps.execute();
		con.close();
	}

	public boolean checkId(String id) throws Exception {
		Connection con = this.getConnection();
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		return rs.next();
	}

	public boolean checkId(MemberDto dto) throws Exception {
		return this.checkId(dto.getId());
	}

	public String findId(String name, String phone) throws Exception {
		Connection con = this.getConnection();
		String sql = "select id from member where name=? and phone=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, phone);
		ResultSet rs = ps.executeQuery();
		String id = null;
		if (rs.next()) {
			id = rs.getString("id");
		}
		con.close();
		return id;
	}

	public String findId(MemberDto dto) throws Exception {
		return this.findId(dto.getName(), dto.getPhone());
	}

	public MemberDto getInfo(String id) throws Exception {
		Connection con = this.getConnection();
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		MemberDto dto;
		if (rs.next()) {
			dto = new MemberDto();
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setName(rs.getString("name"));
			dto.setJoindate(rs.getString("joindate"));
			dto.setGrade(rs.getString("grade"));
			dto.setPoint(rs.getInt("point"));
			dto.setPost(rs.getString("post"));
			dto.setBasic_addr(rs.getString("basic_addr"));
			dto.setExtra_addr(rs.getString("extra_addr"));
			dto.setPhone(rs.getString("phone"));
			dto.setLast_login(rs.getString("last_login"));
			return dto;
		}
		con.close();
		return null;
	}

//	최종 로그인 시간 변경 메소드
	public void updateLastLogin(String id) throws Exception{
		Connection con = getConnection();
		
		String sql = "update member set last_login = sysdate where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.execute();
		
		con.close();
	}

	public void exit(String id) throws Exception{
		Connection con = getConnection();
		
		String sql = "delete member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.execute();
		
		con.close();
	}
	
	//비밀번호 변경 메소드
	public void changePassword(String id, String pw) throws Exception{
		Connection con = getConnection();

		String sql = "update member set pw=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, id);

		ps.execute();

		con.close();
	}
	
	public void changeInfo(String id, String phone, String post, String basic_addr, String extra_addr) throws Exception{
		Connection con = getConnection();
		
		String sql = "update member set phone= ?, post= ?, basic_addr=?, extra_addr=? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, phone);
		ps.setString(2, post);
		ps.setString(3, basic_addr);
		ps.setString(4, extra_addr);
		ps.setString(5, id);
		ps.execute();
		
		con.close();
	}
	
	public void changeInfo(MemberDto dto) throws Exception{
		this.changeInfo(dto.getId(), dto.getPhone(), dto.getPost(), dto.getBasic_addr(), dto.getExtra_addr());
	}
	
	public List<MemberDto> getMemberList() throws Exception{
		Connection con = getConnection();
		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto dto = new MemberDto();
			
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setName(rs.getString("name"));
			dto.setJoindate(rs.getString("joindate"));
			dto.setGrade(rs.getString("grade"));
			dto.setPoint(rs.getInt("point"));
			dto.setPost(rs.getString("post"));
			dto.setBasic_addr(rs.getString("basic_addr"));
			dto.setExtra_addr(rs.getString("extra_addr"));
			dto.setPhone(rs.getString("phone"));
			dto.setLast_login(rs.getString("last_login"));
			
			list.add(dto);
		}
		return list;
	}
	
	public List<MemberDto> search(String id) throws Exception{
		Connection con = getConnection();
		String sql = "select * from member where id like ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%"+id+"%");
		ResultSet rs = ps.executeQuery();
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto dto = new MemberDto();
			
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setName(rs.getString("name"));
			dto.setJoindate(rs.getString("joindate"));
			dto.setGrade(rs.getString("grade"));
			dto.setPoint(rs.getInt("point"));
			dto.setPost(rs.getString("post"));
			dto.setBasic_addr(rs.getString("basic_addr"));
			dto.setExtra_addr(rs.getString("extra_addr"));
			dto.setPhone(rs.getString("phone"));
			dto.setLast_login(rs.getString("last_login"));
			
			list.add(dto);
		}
		return list;
	}
}
