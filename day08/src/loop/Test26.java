package loop;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
//		끝말 잇기 프로그램
//		 - 주어진 제시어 : "반목문"
//		 - 사용자에게 입력을 받아 제시어와 연결되는 경우 계속 진행
//		 - 사용자에게 입력받은 단어가 제시어와 연결되지 않은 경우 게임 종료
//		게임 종료 시 사용자가 제대로 입력한 횟수를 구하여 화면에 출력
		
		Scanner sc = new Scanner(System.in);
		String str = "반복문";
		String inputStr;
		int combo = 0;
		
		while(true) {
			System.out.println(str + "-> ");
			inputStr = sc.next();
			if(str.charAt(str.length()-1) == inputStr.charAt(0)) {
				System.out.println(++combo + "번 성공");
				str = inputStr;
			} else {
				System.out.println("잘못입력! 게임 끝!");
				System.out.println("성공 횟수 : " + combo);
				break;
			}
		}
		sc.close();
	}

}
