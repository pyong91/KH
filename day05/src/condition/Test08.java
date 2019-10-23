package condition;

import java.lang.*;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
//		사용자에게 시험 점수를 입력받아서 출력하는 프로그램을 구현
//		만약 잘못된 점수가 입력되었다면 "다시 입력하세요"를 출력
//		 - 0 ~ 100
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		int n = sc.nextInt();
		sc.close();

		if (n >= 0 && n <= 100) {
			if (n < 60) {
				System.out.println("재평가입니다");
			} 
			else {
				System.out.println("합격입니다");
			}	
		} 
		else {
			System.out.println("다시 입력하세요");
		}

	}

}
