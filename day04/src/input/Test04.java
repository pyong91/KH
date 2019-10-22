package input;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		숫자를 입력받는 방법
//		1. 문자열 입력받아서 바꾸는 방법
//		2. 숫자를 입력받는 방법
		
		Scanner sc = new Scanner(System.in);
		
//		문자(입력) -> 숫자 변환
		String a = sc.next();
		int b = Integer.parseInt(a);
		System.out.println(b);
		
//		숫자(입력)
		int c = sc.nextInt();
		System.out.println(c);
		
		sc.close();
	}

}
