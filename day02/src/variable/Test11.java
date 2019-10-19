package variable;

public class Test11 {
//	문제
//	영화관 이용 요금은 다음과 같습니다.
//	성인 : 10,000원	청소년 : 7,000원
//	
//	성인 2명, 청소년 3명이 영화를 보러가서 제휴카드로 25% 할인을 받았습니다.
//	결제 금액은?
	
	public static void main(String[] args) {
		int adult = 10000;
		int teen = 7000;
		int sum1 = adult * 2;
		int sum2 = teen * 3;
		int total = sum1 + sum2;
		System.out.println((int)(total * 0.75) + "원");
	}

}
