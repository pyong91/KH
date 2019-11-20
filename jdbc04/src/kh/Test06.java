package kh;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		KHMemberDao dao = new KHMemberDao();
		
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.nextLine();
		sc.close();
		if(dao.login(id, pw)) {
			dao.exit(id);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
}
