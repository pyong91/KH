package condition;

import java.util.Scanner;

public class Test05_1 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		b = sc.nextInt();
		sc.close();

		c = a - b;
		
		if (a < b) {
			c = -c;
		}
		
		System.out.println(c);

	}

}
