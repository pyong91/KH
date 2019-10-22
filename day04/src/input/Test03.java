package input;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		사용자에게 다음 정보를 입력받아 화면에 출력해주세요
//		1. 아이디(ID)
//		2. 비밀번호(Password)
//		3. 닉네임(Nickname)
//		입력받은 뒤 입력받은 정보와 "글자수"를 구하여 화면에 출력
		
		Scanner sc = new Scanner(System.in);
		String id, pwd, nnm;
		int idlen, pwdlen, nnmlen;
		
//		입력
		System.out.print("아이디(ID)를 입력해주세요 : ");
		id = sc.next();
		
		System.out.println("비밀번호(Password)를 입력해주세요 : ");
		pwd = sc.next();
		
		System.out.println("닉네임(Nickname)을 입력해주세요 : ");
		nnm = sc.next();
		
		sc.close();
		
//		글자수 구하기
		idlen = id.length();
		pwdlen = pwd.length();
		nnmlen = nnm.length();
		
//		출력
		System.out.println("아이디 글자수 : " + idlen);
		System.out.println("패스워드 글자수 : " + pwdlen);
		System.out.println("닉네임 글자수 : " + nnmlen);

	}

}
