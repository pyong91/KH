package oop.modifier3;

public class Test_modifier3 {

	public static void main(String[] args) {
//		아파트 분양가 정보
//		평    형 | 방개수 | 화장실 개수 | 베란다 확장여부 | 가격 |
//		25평형 |   2  |    1   |      X    |  3억
//		28평형 |   2  |    2   |      O    | 3억 5천
//		31평형 |   3  |    3   |      O    |  4억
//		조건
//		 - 아파트 평형은 25, 28, 31, 34 평형만 설정이 가능
//		 - 방 개수는 1개 이상이다
//		 - 화장실 개수는 1개 이상이다
//		 - 가격은 0 이상이어야 하며 100만원 미만은 버리고 설정
		
		Apartment a = new Apartment();
		Apartment b = new Apartment();
		Apartment c = new Apartment();
		
		a.setPyung(25);
		a.setRoom(1);
		a.setBathroom(1);
		a.setVeranda(false);
		a.setPrice(300000000);
		
		b.setPyung(25);
		b.setRoom(2);
		b.setBathroom(2);
		b.setVeranda(true);
		b.setPrice(350000000);
		
		c.setPyung(25);
		c.setRoom(3);
		c.setBathroom(3);
		c.setVeranda(true);
		c.setPrice(400000000);
		
		a.print();
		b.print();
		c.print();
	}

}
