package oop.multi2;

//음성인식기능 : bixby() , 화면에 "음성인식기능을 사용합니다" 출력
//삼성페이 : samsungpay() , 화면에 "삼성페이기능을 사용합니다" 출력
//전화 : call() , 화면에 "전화 기능을 실행합니다" 출력
public class GalaxyS10 extends Phone implements SK, KT, LG{
	
	public void bixby() {
		System.out.println("음성인식기능을 사용합니다");
	}

	public void samsungpay() {
		System.out.println("삼성페이기능을 사용합니다");
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
