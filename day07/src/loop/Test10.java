package loop;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
//		사용자에게 5개의 숫자를 입력받아 입력받은 모든 값의 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg;
		int n;
		
		for(int i = 0; i<5; i++) {
			n = sc.nextInt();
			sum +=n;
			System.out.println("합계 : " + sum);
		}
		
		sc.close();
		avg = sum / 5.0;
		System.out.println("평균 : " + avg);
		
	}

}