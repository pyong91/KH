package condition;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		문제
//		사용자에게 이번 시험 점수를 입력받습니다.
//		60점 이상이면 "통과입니다"를 출력, 아니면 "재평가를 보셔야 합니다"

		Scanner sc = new Scanner(System.in);

//		입력
		System.out.println("시험 점수를 입력하세요");
		int n = sc.nextInt();
		sc.close();

//		출력
		if (n >= 60) {
			System.out.println("통과입니다");
		}
		if (n < 60) {
			System.out.println("재평가를 보셔야 합니다");
		}

	}

}
