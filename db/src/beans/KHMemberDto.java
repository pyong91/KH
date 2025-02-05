package beans;

public class KHMemberDto {
	private int number;
	private String name;
	private String id;
	private String pw;
	private int point;
	private String joinDate;

	@Override
	public String toString() {
		return "KHMemberDto [number=" + number + ", name=" + name + ", id=" + id + ", pw=" + pw + ", point=" + point
				+ ", joinDate=" + joinDate + "]";
	}

	public KHMemberDto() {
		super();
	}

	public KHMemberDto(int number, String name, String id, String pw, int point, String joinDate) {
		super();
		this.number = number;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.point = point;
		this.joinDate = joinDate;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
}
