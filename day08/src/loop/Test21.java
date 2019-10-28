package loop;

import java.util.Random;

public class Test21 {

	public static void main(String[] args) {
//		총 5번의 회차 동안 주사위 2개를 3번을 던져 나오는 모든 수의 합계를 출력
		
		Random r = new Random();
		int dice1, dice2, sum1, sum2, total = 0;
		
		for (int i = 1; i <= 5; i++) {
			sum2 = 0;
			for (int j = 1; j <= 3; j++) {
				dice1 = r.nextInt(6) + 1;
				dice2 = r.nextInt(6) + 1;
				sum1 = dice1 + dice2;
				System.out.print(i + "회차 " + j +"번째 주사위 결과 : " + dice1 + ", " + dice2);
				System.out.println(" 합계 : " + sum1);
				
				total += sum1;
				sum2 += sum1;
			}
			System.out.println(i + "회차 총 합계 : " + sum2);
		}
		System.out.println("총 합계 : " + total);
	}

}
