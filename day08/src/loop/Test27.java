package loop;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
//		대칭문자열 판독기 만들기
//		사용자에게 입력받은 문자열이 "대칭문자열"인지 판독하여 출력
//		 - 대칭문자열은 좌우가 똑같은 문자열을 말합니다.
//		 - "기러기"는 대칭문자열입니다.
//		 - "짝짝"은 대칭문자열입니다.
//		 - 최소한 2글자 이상이어야 대칭문자열이 될 수 있습니다.

		Scanner sc = new Scanner(System.in);
		String inputStr;
		char a, b;
		boolean is;
		
		while (true) {
//			입력
			is = true;
			System.out.println("단어를 입력하세요");
			inputStr = sc.nextLine();
			
//			검사
			for (int i = 0; i < inputStr.length() / 2; i++) {
				a = inputStr.charAt(i);
				b = inputStr.charAt(inputStr.length() - 1 - i);
				if(a != b) {
					is = false;	
					break;
				}
			}
			
//			출력
			if(is) {
				System.out.println("대칭문자열입니다");
			} else {
				System.out.println("대칭문자열이 아닙니다");
			}
		}

//		sc.close();

	}

}
