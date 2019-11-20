package kh;

import java.util.Scanner;

//	아이디, 비밀번호, 이름을 입력받아 등록하는 프로그램 구현
public class Test01 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.next();
		
		KHMemberDao dao = new KHMemberDao();
		dao.insertMember(name, id, pw);
	}
}
