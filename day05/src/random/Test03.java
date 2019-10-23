package random;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
//		랜덤으로 구구단 문제 한개를 출제하는 프로그램을 구현

		Random r = new Random();
		
		int v1 = r.nextInt(8) + 2;
		int v2 = r.nextInt(9) + 1;
		System.out.println(v1 + " X " + v2 + " = ?");
		
	}

}
