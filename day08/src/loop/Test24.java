package loop;

import java.util.Random;

public class Test24 {

	public static void main(String[] args) {
//		주사위를 6이 나올때까지 던지는 프로그램을 구현하세요
		Random r = new Random();
		int n;
		
		while(true) {
			n = r.nextInt(6) + 1;
			System.out.println(n);
			if(n == 6) break;
		}
	}

}
