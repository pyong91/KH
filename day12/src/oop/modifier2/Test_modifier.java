package oop.modifier2;

public class Test_modifier {

	public static void main(String[] args) {
//		휴대전화 신규 개통자 정보
//		 - 이름 : 가나다, 휴대폰 : 갤럭시s10, 통신사 : SK, 약정기간 : 24개월, 할부원금 : 110만원
//		 - 이름 : 라마바, 휴대폰 : 아이폰11, 통신사 : KT, 약정기간 : 36개월, 할부원금 : 150만원
//		 - 이름 : 사아자, 휴대폰 : v50, 통신사 : LG, 약정기간 : 24개월, 할부원금 : 120만원
//		 조건
//		 - 통신사는 SK, KT, LG, 알뜰폰 까지만 가능
//		 - 약정기간은 0, 24, 30, 36개월 중에서만 선택 가능
//		 - 할부원금은 음수가 될 수 없음
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		
		c1.setName("가나다");
		c1.setModel("갤럭시s10");
		c1.setTelecom("SK");
		c1.setAgreement(24);
		c1.setPrincipal(1100000);
		
		c2.setName("라마바");
		c2.setModel("아이폰11");
		c2.setTelecom("KT");
		c2.setAgreement(36);
		c2.setPrincipal(1500000);
		
		c3.setName("사아자");
		c3.setModel("v50");
		c3.setTelecom("LG");
		c3.setAgreement(24);
		c3.setPrincipal(1200000);
		
		c1.print();
		c2.print();
		c3.print();
	}

}
