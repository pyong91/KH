package oop.inherit6;

public class Phone {
	protected String number;		// 필수, 변경가능
	
	public Phone(String number){
		this.number = number;
		System.out.println("Phone 생성자 호출");
	}
	
	public final void call() {
		System.out.println("전화를 겁니다");
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
