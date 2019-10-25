package loop;

import java.util.Random;
import java.util.Scanner;

public class Test11 {

//	구구단 문제를 출제하고 답을 입력받아 맞았는지 틀렸는지 판정하는 프로그램을 구현
//	문항수는 5개로 구현하고, 한 문제 출제 후 정답을 입력받는 형식으로 구현
//	프로그램이 끝나기 전에 맞춘 개수를 구하여 화면에 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int result, n1, n2, 
			count = 0;
		
		for(int i = 0; i < 5; i++) {
			n1 = r.nextInt(8) + 2;
			n2 = r.nextInt(9) + 1;
			System.out.println(n1 + " X " + n2 + " = ?");
			result = sc.nextInt();
			if(result == n1 * n2) {
				count++;
			}
		}
		sc.close();
		System.out.println("정답 수 : " + count);
		
	}
}

