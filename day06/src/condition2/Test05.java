package condition2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		사용자에게 닉네임을 입력받는 프로그램 구현
//		 -> "운영자"라는 단어는 닉네임 설정이 불가능하도록 처리
		Scanner sc = new Scanner(System.in);
		String nick;
		
		System.out.println("닉네임 입력");
		nick = sc.next();
		sc.close();
		
		if(nick == "운영자") {
			System.out.println("if : 사용할 수 없는 닉네임입니다.");
		} else {
			System.out.println("if : 닉네임 설정이 완료되었습니다.");
		}
		
		switch(nick) {
		case "운영자": System.out.println("switch : 사용할 수 없는 닉네임입니다."); break; 
		default : System.out.println("switch : 닉네임 설정이 완료되었습니다."); break;
		}

	}

}
