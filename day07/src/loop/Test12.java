package loop;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
//		끝말잇기 게임
//		사용자에게 단어를 입력받아서 끝말잇기 게임을 구현
//		 - 횟수는 5번만 구현
//		 - 제대로 입력을 하든 잘못 입력을 하든 5번은 무조건 실행
//		 - 제시어는 "자바"
//		제대로 끝말이 이어지도록 입력한 횟수를 세어 출력
		
		Scanner sc = new Scanner(System.in);
		
		String str = "자바";
		String inputStr;
		int count = 0;
		boolean b;
		
		for(int i = 0; i <5; i++) {
			System.out.print(str + " -> ");
			inputStr = sc.next();
			b = str.charAt(str.length()-1) == inputStr.charAt(0);
			if(b) {
				count++;
				str = inputStr;
			} else {
				System.out.println("잘못입력하셨습니다");
				System.out.print(str + " -> ");
			}
				
			
		}
		
		sc.close();
		System.out.println("정답수 : " + count);
	}

}
