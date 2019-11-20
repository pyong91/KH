package kh;

import java.util.Scanner;

//	사용자에게 아이디와 비밀번호를 입력받아 로그인 처리를 수행하는 프로그램 구현
public class Test04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		KHMemberDao dao = new KHMemberDao();
		
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.next();
		
		if(dao.login(id, pw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
	}
	
}
