package oop.inherit6;

public class GalaxyNote10 extends Galaxy{

	public GalaxyNote10(String number) {
		super(number);
		System.out.println("GalaxyNote10 생성자 호출");
	}
	
	public void memo() {
		System.out.println("메모를 실행합니다");
	}
}
