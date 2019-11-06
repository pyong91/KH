package api.lang.string;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
//		사용자에게 아이디와 비밀번호를 입력받아 로그인을 처리하는 프로그램 구현

//		 - 아이디는 대소문자가 상관없으며, "khacademy"라는 글자일 경우만 통과
//		 - 비밀번호는 대소문자를 지켜야하며 , "Student"라는 글자일 경우만 통과

//		로그인 성공 / 실패를 판정한 뒤 사용자에게 메시지를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String pwd = sc.next();
		sc.close();
		
		String a = "khacademy";
		String b = "Student";

		if (id.equalsIgnoreCase(a) && pwd.equals(b)) {
			System.out.println("로그인 성공");
		} else
			System.out.println("로그인 실패");

	}

}
