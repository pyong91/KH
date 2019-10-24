package random;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
//		지하철 요금표는 다음과 같습니다.
//		 - 성인	(20세 ~ 64세)		1,250원
//		 - 청소년	(14세 ~ 19세)		  720원
//		 - 어린이	( 8세 ~ 13세)		  450원
//		 - 유아 및 노인					0원

//		사용자에게 생년월일 8자리를 입력받아 요금을 계산하고
//		서울지하철 창립 5주년을 맞아서 주사위를 던져서 5가 나오면 10% 할인을 진행
//		최종 요금을 계산하여 출력
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
//		변수생성
//		 - 요금표
		int adultPrice, teenPrice,
			childPrice, babyPrice;
//		 - 생년월일, 나이, 주사위, 최종요금
		int birth, age, dice, total;

		
//		지하철 요금 초기화
		adultPrice = 1250;
		teenPrice = 720;
		childPrice = 450;
		babyPrice = 0;
		
//		입력
		System.out.println("생년월일 8자리를 입력하세요");
		birth = sc.nextInt();
		sc.close();
		
//		나이계산
		birth = birth / 10000;
		age = Calendar.getInstance().get(Calendar.YEAR) - birth + 1;
		
		
//		연령별 요금 입력
		if(age >= 20 && age <= 64) {
			total = adultPrice;
		}
		else if(age >= 14 && age <= 19) {
			total = teenPrice;
		}
		else if(age >= 8 && age <= 13) {
			total = childPrice;
		}
		else {
			total = babyPrice;
		}
		
		System.out.println("기본 요금 : " + total);
		
//		행사 할인
		
		dice = r.nextInt(6) + 1;
		if(total > 0 && dice == 5) {
			total = total * 90 / 100;
			System.out.println("주사위 : " + dice);
		}
		
//		price *= 90;
//		price = price / 10 * 10; 버림
//		price = (price +5) / 10 * 10; 반올림
		
		
//		출력
		System.out.println("최종 요금 : " + total);
		
	}

}
