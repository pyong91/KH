package loop;

import java.util.Random;

public class Test25 {
	
	public static void main(String[] args) {
//		어떤 게임에서 감옥에 갇히게 되면 주사위 2개를 던져 탈출을 시도해야 합니다.
//		주사위 2개를 던져서 같은 숫자가 연속으로 2번 나와야 탈출이 가능하다고 할 때
//		주사위를 몇번 던져야 탈출이 가능한지 계산하는 프로그램 구현
		
		Random r = new Random();
		int a, b, count = 0;
		int dCount = 0;
		
		while(dCount<2) {
			System.out.print((count+1) + "번째 도전 : ");
			a = r.nextInt(6) + 1;
			b = r.nextInt(6) + 1;
			count++;
			System.out.println(a + ", " + b);
			if(a == b) {
				System.out.println("더블!");
				dCount++;
			} else {
				dCount = 0;
			}
		}
		System.out.println(count + "번째 시도에 탈출");
		
		Status status;
		status = Status.valueOf("STOP");
		System.out.println(status.getStatus());	
	}

}

enum Status {
	START("시작"), STOP("정지");
	
	private String value;
	private Status(String value) {
		this.value = value;
	}
	public String getStatus() {
		return value;
	}
	
}
