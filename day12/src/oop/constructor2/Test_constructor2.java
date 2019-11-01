package oop.constructor2;

import java.util.Scanner;

public class Test_constructor2 {

	public static void main(String[] args) {
		
//		회원목록
//		아이디 | 비밀번호 | 닉네임 | 권한 | 포인트
		
//		사용자에게 필요한 정보를 입력받아서 회원 1명을 생성 후 출력
//		 - 권한은 사용자가 입력하면 해당하는 권한으로 설정
//		 - 권한을 입력하지 않으면 "일반"으로 설정
//		 - 포인트는 무조건 0으로 생성
//		 - 닉네임은 2~7글자로만 설정
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();
		System.out.print("닉네임을 입력하세요 : ");
		String nickName = sc.next();
		System.out.print("권한을 입력하세요(일반은 'X'입력) : ");
		String modifier = sc.next();
		
//		System.out.println("이름 비밀번호 닉네임 권한 순으로 입력하세요");
//		Member a = new Member(sc.next(), sc.next(), sc.next(), sc.next());
//		Member a = new Member(name, password, nickName);
		Member a = new Member(name, password, nickName, modifier);
		
		a.print();
	
	}

}
