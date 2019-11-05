package oop.multi2;

public class IPhone extends Phone implements SK, KT, LG{
	public void airdrop() {
		System.out.println("에어드랍기능을 사용합니다");
	}
	
	public void icloud() {
		System.out.println("iCloud 기능을 사용합니다");
	}
	
	@Override
	public void call() {
		System.out.println("전화기능을 사용합니다");
	}

	@Override
	public void uplusTv() {
		System.out.println("유플티비를 실행합니다");
	}

	@Override
	public void ollehStore() {
		System.out.println("올레스토어 기능을 실행합니다");
	}

	@Override
	public void tmap() {
		System.out.println("tmap 기능을 사용합니다");
	}
}
