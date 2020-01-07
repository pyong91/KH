package home.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ReplyDao {
	
	private static DataSource source;
	static {
		// source에 context.xml의 Resource 정보를 설정
		// [1] 탐색 도구 생성
		// [2] 도구를 이용하여 탐색 후 source에 대입
		try {
			InitialContext ctx = new InitialContext(); //[1]
			source = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle"); // name="jdbc/oracle" 찾아
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	
//	연결 메소드
	public Connection getConnection() throws Exception {
//		return common-dbcp에서 관리하는 연결을 빌려와라;
		return source.getConnection();
	}
	
	public void write(ReplyDto dto) throws Exception{
		Connection con = getConnection();
//		[1]content [2]writer [3]boardno(origin)
		String sql = "insert into reply values(?, ?, sysdate, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, getSequence());
		ps.setString(2, dto.getContent());
		ps.setString(3, dto.getWriter());
		ps.setInt(4, dto.getOrigin());
		
		ps.execute();
		con.close();
	}
	
	public int getSequence() throws Exception{
		Connection con = getConnection();
		String sql = "select board_seq.nextval from dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int no = rs.getInt("nextval");
		
		con.close();
		return no;
	}
	
	public ReplyDto getInfo(int reply_no) throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from reply where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, reply_no);
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		ReplyDto dto = new ReplyDto();
		dto.setReply_no(rs.getInt("no"));
		dto.setContent(rs.getString("content"));
		dto.setWdate(rs.getString("wdate"));
		dto.setWriter(rs.getString("write"));
		dto.setOrigin(rs.getInt("origin"));
		
		con.close();
		return dto;
	}
	
	public List<ReplyDto> getList(int origin) throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from reply where origin = ? order by wdate asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, origin);
		ResultSet rs = ps.executeQuery();
		
		List<ReplyDto> list = new ArrayList<>();
		while(rs.next()) {
			ReplyDto dto = new ReplyDto();
			
			dto.setReply_no(rs.getInt("no"));
			dto.setContent(rs.getString("content"));
			dto.setWriter(rs.getString("writer"));
			dto.setWdate(rs.getString("wdate"));
			dto.setOrigin(origin);
			
			list.add(dto);
		}
		con.close();
		return list;
	}

	public void delete(int no) throws Exception{
		Connection con = getConnection();
		String sql = "delete reply where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ps.execute();
		
		con.close();
	}
}



















