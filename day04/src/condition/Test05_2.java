package condition;

import java.util.Scanner;

public class Test05_2 {

	public static void main(String[] args) {
		int a, b, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		b = sc.nextInt();
		sc.close();
		
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		a -= b;
		System.out.println(a);
	}

}
