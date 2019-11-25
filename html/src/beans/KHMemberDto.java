package beans;

public class KHMemberDto {
	private int no;
	private String name;
	private String id;
	private String pw;
	private int point;
	private String joinDate;

	public KHMemberDto() {
		super();
	}

	public KHMemberDto(int no, String name, String id, String pw, int point, String joinDate) {
		super();
		this.no = no;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.point = point;
		this.joinDate = joinDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getJoinDate() {
		return joinDate.substring(0, 10);
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
}
