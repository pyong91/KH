package oop.inherit6;

public class Galaxy extends Phone{
	
	public Galaxy(String number) {
		super(number);
		System.out.println("Galaxy 생성자 호출");
	}
	
	public final void sms() {
		System.out.println("문자를 보냅니다");
	}
}
