package oop.modifier6;

public class User {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private boolean isPass;

	User(String name, int kor, int eng, int math) {
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
		this.setTotal(kor + eng + math);
		this.setAvg(this.getTotal() / 3);
		this.setPass(this.getAvg() >= 60 ? true : false);
	}

	public void print() {
		System.out.println("이름  : " + this.getName());
		System.out.println("국어  : " + this.getKor());
		System.out.println("영어  : " + this.getEng());
		System.out.println("수학  : " + this.getMath());
		System.out.println("총점  : " + this.getTotal());
		System.out.println("평균  : " + this.getAvg());
		if (isPass)
			System.out.println("결과 : 합격");
		else
			System.out.println("결과 : 불합격");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public boolean isPass() {
		return isPass;
	}

	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}

}
