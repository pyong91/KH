package home.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class FilesDao {

//	자원을 참조하는 변수 생성(리모컨)
//	DataSource source = context.xml의 자원정보 / 한번에 못구함;
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

	public void insert(FilesDto fdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "insert into files(no, origin, uploadname, savename, filetype, filesize)"
					+ " values(files_seq.nextval, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, fdto.getOrigin());
		ps.setString(2, fdto.getUploadName());
		ps.setString(3, fdto.getSaveName());
		ps.setString(4, fdto.getFileType());
		ps.setLong(5, fdto.getFileSize());
		ps.execute();
		
		con.close();
	}
	
	public List<FilesDto> getList(int no) throws Exception{
		Connection con = getConnection();
		String sql = "select * from files where origin = ? order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		
		List<FilesDto> list = new ArrayList<>();
		while(rs.next()) {
			FilesDto dto = new FilesDto();
			dto.setFiles_no(rs.getInt("no"));
			dto.setFileSize(rs.getLong("filesize"));
			dto.setFileType(rs.getString("filetype"));
			dto.setOrigin(rs.getInt("origin"));
			dto.setSaveName(rs.getString("savename"));
			dto.setUploadName(rs.getString("uploadname"));
			
			list.add(dto);
		}
		
		return list;
	}

	public FilesDto getInfo(int no) throws Exception{
		Connection con = getConnection();

		String sql = "select * from files where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();

		FilesDto fdto = null;
		if(rs.next()) {
			fdto = new FilesDto();
			fdto.setFiles_no(rs.getInt("no"));
			fdto.setOrigin(rs.getInt("origin"));
			fdto.setUploadName(rs.getString("uploadname"));
			fdto.setSaveName(rs.getString("savename"));
			fdto.setFileType(rs.getString("filetype"));
			fdto.setFileSize(rs.getLong("filesize"));
		}

		con.close();
		return fdto;
	}
}
