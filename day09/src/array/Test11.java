package array;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
//		우리반 학생들의 성적은 다음과 같습니다.
//		 -71, 89, 90, 92, 85, 88, 92, 63, 99, 78 점
//		1. 80점 이상인 사람은 몇 명인지 세어서 출력
//		2. 사용자에게 시험 점수를 입력받아 예상 등수를 출력
		Scanner sc = new Scanner(System.in);
	
		int[] scoreAry = new int[] {71, 89, 90, 92, 85, 88, 92, 63, 99, 78};
		int count = 0;
		int userScore;
		int grade = scoreAry.length + 1;
		
//		1. 80점 이상인 사람은 몇 명인지 세어서 출력
		for (int i = 0; i < scoreAry.length; i++) {
			if(scoreAry[i] >=80) count++;
		}
		System.out.println("80점 이상인 사람은? " + count + "명");
		
//		2. 사용자에게 시험 점수를 입력받아 예상 등수를 출력
		System.out.println("점수를 입력하세요");
		userScore = sc.nextInt();
		sc.close();
		for (int i = 0; i < scoreAry.length; i++) {
			if(scoreAry[i] < userScore) grade--;
		}
		System.out.println("당신의 등수는 : " + grade + "등입니다.");
		
		
	}

}
