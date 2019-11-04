package oop.inherit6;

public class IPhone10 extends IPhone{
	
	public IPhone10(String number) {
		super(number);
		System.out.println("IPhone10 생성자 호출");
	}
	
	public void itunes() {
		System.out.println("아이튠즈를 실행합니다");
	}

}
