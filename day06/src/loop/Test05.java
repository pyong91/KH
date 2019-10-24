package loop;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
//		주사위 2개를 10번 던졌을 때 각각의 회차별 주사위 결과값을 출력
//		"똑같은 숫자"가 나온 경우를 세서 출력
		Random r = new Random();
		
		int n1, n2, 
			count = 0;
		
		for(int i = 0; i < 10; i++) {
			n1 = r.nextInt(6) + 1;
			n2 = r.nextInt(6) + 1;
			System.out.print((i+1) + "차" + "\t주사위 값 : " + n1 + " " + n2);
			if(n1 == n2) {
				count++;
				System.out.print("\t같아요!");
			} 

			System.out.println();
		}
		System.out.println("count : " + count);

	}

}
