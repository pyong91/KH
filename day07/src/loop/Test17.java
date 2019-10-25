package loop;

import java.util.Random;
import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
//		업다운 게임 만들기
//		랜덤으로 1부터 1000사이의 정수를 하나 추첨한 뒤 이를 맞추는 게임을 구현
//		총 10번의 기회가 주어지며, 문제를 맞추는 순간 게임이 종료됩니다.
		
//		- 업 : 정답이 사용자가 입력한 값보다 더 큰 경우
//		- 다운 : 정답이 사용자가 입력한 값보다 더 작은 경우
//		- 정답 : 정답과 사용자가 입력한 값이 일치하는 경우
		
//		사용자가 10번의 기회 중 정답을 맞춘 경우 "게임 클리어" 출력
//		사용자가 10번의 기회 중 정답을 맞추지 못한 경우 "게임 오버" 출력
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n, val;
		n = r.nextInt(1000) + 1;

		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "번째 기회, 입력 : ");
			val = sc.nextInt();
			if(n == val) {
				System.out.println("게임 클리어");
				break;
			} else if(i == 10) {
				System.out.println("게임 오버");
			} else if(val > n) {
				System.out.println("다운");
			} else {
				System.out.println("업");
			} 
			
		}
		
	}

}
