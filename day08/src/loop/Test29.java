package loop;

import java.util.Scanner;

public class Test29 {

	public static void main(String[] args) {
//		do~while 반복구문
//		 - do 구문을 실행해보고 반복 여부를 판정
		
		Scanner sc = new Scanner(System.in);
		
//		do~while문을 이용하여 점수 입력받기
		int score;
		
		do {
			System.out.println("점수 입력");
			score = sc.nextInt();
		} while(score < 0 || score > 100);
		
		System.out.println("점수 : " + score);
		
//		sc.close();
	}

}
