package condition;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		사용자에게 생년월일 8자리를 입력받습니다.
//		생년월일이 다음 조건에 해당되면 할인을 진행
//		 - 21세기 출생자  -> 5천원 할인
//		 - 여름에 태어난 사람 (6, 7, 8월) -> 10% 할인
//		10만원인 물건을 구매한다고 가정할 때,
//		사용자의 생년월일에 따른 예상 결제금액을 구하여 출력
			
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일 8자리를 입력하세요");
		int birth = sc.nextInt();
		sc.close();
//
		int price = 100000;
//		int m = birth / 100 % 100;
//		
//		if(birth > 20000000) {	// 2000년이상 5000원할인
//			total -= 5000;
//		}
//		
//		if(m / 3 == 2) {	//6~8월 10%할인
//			total -= total / 10;
//		}
//		
//		System.out.println(total);
		
		int year = birth / 10000;
		int month = birth / 100 % 100;
		
		if(year >= 2000) {
			price -= 5000;
		}
		
		if(month / 3 == 2) {
			price *= 0.9;
		}
		
		System.out.println(price);
	}

}
