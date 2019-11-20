package kh;

import java.util.Scanner;

//	사용자에게 아이디 / 비밀번호를 입력 받아서 맞다면 수정할 정보(비밀번호)를 입력받아 수정 처리하는 메소드 구현

public class Test05 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		KHMemberDao dao = new KHMemberDao();
		
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.nextLine();
		
		if(dao.login(id, pw)) {
			System.out.println("로그인 성공");
			System.out.println("새로운 비밀번호를 입력하세요");
			String new_pw = sc.nextLine();
			sc.close();
			dao.changePassword(new_pw, id);
		} else {
			System.out.println("로그인 실패");
		}		
		
		
//		id = "asdf1";
//		pw = "qwer2";
//		String new_pw = "asdf1";
//		
//		boolean success = dao.changePassword(id, pw, new_pw);
//		if(success) {
//			System.out.println("변경 완료");
//		} else {
//			System.out.println("정보가 잘못되었습니다.");
//		}
	}
}
