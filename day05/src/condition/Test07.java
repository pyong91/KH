package condition;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
//		사용자에게 "이름"을 입력받습니다.
//		그리고 그 단어의 시작 글자가 한글인지 검사하는 프로그램을 만들 계획입니다.
//		만약 한글로 시작한다면 "올바른 입력값입니다" 출력하시고
//		아니면 "잘못된 입력값입니다"를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String str = sc.next();
		sc.close();
		
		char c = str.charAt(0);
		
		if(c >= '가' && c <= '힣') {
			System.out.println("올바른 입력값입니다");
		} else {
			System.out.println("잘못된 입력값입니다");
		}		
		
	}

}
