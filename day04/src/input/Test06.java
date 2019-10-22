package input;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		사용자에게 국어, 영어, 수학 시험점수를 입력받아 "총점"과 "평균"을 구하여 출력
		
		int kor, eng, mat;
		int sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		mat = sc.nextInt();
				
		sc.close();
		
		sum = kor + eng + mat;
		avg = (double)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
