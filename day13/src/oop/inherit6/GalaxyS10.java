package oop.inherit6;

public class GalaxyS10 extends Galaxy{
	
	GalaxyS10(String number){
		super(number);
		System.out.println("GalaxyS10 생성자 호출");
	}
	
	public void bixby() {
		System.out.println("bixby를 실행합니다");
	}
}
