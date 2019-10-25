package loop;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) throws InterruptedException {
//		타이머 만들기
//		사용자에게 분/초를 입력받습니다.
//		해당되는 시간만큼의 메시지를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int m, s, time;
		
		System.out.println("분을 입력하세요");
		m = sc.nextInt();
		System.out.println("초를 입력하세요");
		s = sc.nextInt();
		sc.close();
		
		time = m * 60 + s;
		
		for(int i = time; i >= 0; i--) {
			System.out.println((i/60) + "분 " + (i%60) + "초..");
			if(i == 0) break;
			Thread.sleep(1000L);
		}
		System.out.println("땡!");
	}

}
