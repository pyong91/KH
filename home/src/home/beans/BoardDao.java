package home.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "home", "home");
	}
	
	public List<BoardDto> getList() throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from board order by no desc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			dto.setNo(rs.getInt("no"));
			dto.setHead(rs.getString("head"));
			dto.setTitle(rs.getString("title"));
			dto.setReplyCount(rs.getInt("replycount"));
			dto.setWriter(rs.getString("writer"));
			dto.setWdate(rs.getString("wdate"));
			dto.setReadCount(rs.getInt("readcount"));
			dto.setContent(rs.getString("content"));
			
			list.add(dto);
		}
		
		con.close();
		return list;
	}
	
	public void write(BoardDto dto) throws Exception{
		Connection con = getConnection();
		String sql = "insert into board values(board_seq.nextval, ?, ?, 0, ?, sysdate, 0, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getHead());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getWriter());
		ps.setString(4, dto.getContent());
		
		ps.execute();
		con.close();
	}
	
	public BoardDto getInfo(int no) throws Exception{
		Connection con = getConnection();
		String sql = "select * from board where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		BoardDto dto = new BoardDto();
		dto.setNo(rs.getInt("no"));
		dto.setHead(rs.getString("head"));
		dto.setTitle(rs.getString("title"));
		dto.setReplyCount(rs.getInt("replycount"));
		dto.setWriter(rs.getString("writer"));
		dto.setWdate(rs.getString("wdate"));
		dto.setReadCount(rs.getInt("readcount"));
		dto.setContent(rs.getString("content"));
		
		con.close();
		return dto;
	}
	
	public void edit(BoardDto dto) throws Exception{
		Connection con = getConnection();
		String sql = "update board set content=? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getContent());
		ps.setInt(2, dto.getNo());
		
		ps.executeUpdate();
		con.close();
	}
	
	public void delete(int no) throws Exception{
		Connection con = getConnection();
		String sql = "delete board where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ps.executeUpdate();
		con.close();
	}
	
	public void delete(BoardDto dto) throws Exception{
		this.delete(dto.getNo());
	}

}
