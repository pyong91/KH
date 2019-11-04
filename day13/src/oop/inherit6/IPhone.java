package oop.inherit6;

public class IPhone extends Phone{
	
	public IPhone(String number){
		super(number);
		System.out.println("IPhone 생성자 호출");
	}
	
	public final void airdrop() {
		System.out.println("에어드랍을 실행합니다");
	}
}
