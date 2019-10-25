package loop;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
//		1. Factorial 계산기
//		 - n부터 1까지 곱한 결과를 말합니다.
//		 - n! 은 n팩토리얼
//		 - 5! = 5 x 4 x 3 x 2 x 1 = 120
//		 - 사용자에게 입력받은 숫자의 팩토리얼 값을 구해서 출력
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("팩토리얼 계산기");
		System.out.println("숫자하나를 입력해주세요");
		
		n = sc.nextInt();
		sc.close();
		
		for(int i = n-1; i >= 1; i--) {
			n *= i;
			System.out.println(n);
		}
		
		System.out.println("결과 : " + n);
		
		//		2. 피보나치 수열
//		 - 황금비율 계산하는 숫자 모음
//		 - 1번째와 2번째 자리 숫자가 1
//		 - 3번째부터는 앞의 2개를 더한 결과
//		 - 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
//		 - 이 수열을 10번째 자리까지 화면에 출력
		
		int a, b, c;
		a = 1;
		b = 1;
		c = a + b;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 4; i <= 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
		}

	}

}
