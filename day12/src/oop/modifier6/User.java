package oop.modifier6;

public class User {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private boolean isPass;

	public User(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.calc();
	}
	
	private void calc() {
		this.setTotal(this.kor + this.eng + this.math);
		this.setAvg(this.total / 3);
		this.setPass(this.avg >= 60);
	}
	
//	User(String name, int kor, int eng, int math) {
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.setTotal(this.kor + this.eng + this.math);
//		this.setAvg(this.total / 3);
//		this.setPass(this.avg >= 60);
//	}
	

	public void print() {
		System.out.println("이름  : " + this.name);
		System.out.println("국어  : " + this.kor);
		System.out.println("영어  : " + this.eng);
		System.out.println("수학  : " + this.math);
		System.out.println("총점  : " + this.total);
		System.out.println("평균  : " + this.avg);
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

	private void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	private void setAvg(double avg) {
		this.avg = avg;
	}

	public boolean isPass() {
		return isPass;
	}

	private void setPass(boolean isPass) {
		this.isPass = isPass;
	}

}
