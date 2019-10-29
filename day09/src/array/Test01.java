package array;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		변수 : 단일 저장소
//		배열 : 다중 저장소
//		예 : 변수를 이용하여 숫자 5개를 저장 후 출력
		
		int a, b, c, d, e, total;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		sc.close();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		total = a + b + c + d + e;
		System.out.println(total);
		
	}

}
