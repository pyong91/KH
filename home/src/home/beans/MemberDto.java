package home.beans;

public class MemberDto {
	private String id;
	private String pw;
	private String name;
	private String joindate;
	private String grade;
	private int point;
	private String post;
	private String basic_addr;
	private String extra_addr;
	private String phone;
	private String last_login;
	

	public MemberDto(String id, String pw, String name, String joindate, String grade, int point, String post,
			String basic_addr, String extra_addr, String phone, String last_login) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.joindate = joindate;
		this.grade = grade;
		this.point = point;
		this.post = post;
		this.basic_addr = basic_addr;
		this.extra_addr = extra_addr;
		this.phone = phone;
		this.last_login = last_login;
	}
	public MemberDto() {
		super();
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getBasic_addr() {
		return basic_addr;
	}
	public void setBasic_addr(String basic_addr) {
		this.basic_addr = basic_addr;
	}
	public String getExtra_addr() {
		return extra_addr;
	}
	public void setExtra_addr(String extra_addr) {
		this.extra_addr = extra_addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	
	
}
