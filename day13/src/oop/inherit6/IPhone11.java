package oop.inherit6;

public class IPhone11 extends IPhone{
	
	public IPhone11(String number) {
		super(number);
		System.out.println("IPhone11 생성자 호출");
	}
	
	public void siri() {
		System.out.println("시리를 실행합니다");
	}
}
