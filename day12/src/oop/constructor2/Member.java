package oop.constructor2;

public class Member {
	private String name;
	private String password;
	private String nickName;
	private String modifier;
	private int point;

	Member(String name, String password, String nickName) {
		this(name, password, nickName, "일반");
	}

	Member(String name, String password, String nickName, String modifier) {
		setName(name);
		setPassword(password);
		setNickName(nickName);
		setModifier(modifier);
	}
	
	public void print() {
		System.out.println("이름 : " + this.getName());
		System.out.println("비밀번호 : " + this.getPassword());
		System.out.println("닉네임 : " + this.getNickName());
		System.out.println("권한 : " + this.getModifier());
		System.out.println("포인트 : " + this.getPoint());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		if (nickName.length() >= 2 && nickName.length() <= 7)
			this.nickName = nickName;
		else
			System.out.println("닉네임을 잘못 입력했습니다");
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		switch(modifier) {
		case "X":
		case "x":
			this.modifier = "일반";
		default : 
			this.modifier = modifier;
		}
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
