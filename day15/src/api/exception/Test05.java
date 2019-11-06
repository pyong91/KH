package api.exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
//		사용자에게 닉네임을 입력받아서 등록하는 프로그램을 구현
//
//		다음 경우에 해당하면 닉네임 등록을 거절하고 예외 메시지를 출력
//
//		- 닉네임이 2~6글자가 아닌 경우
//		- 닉네임에 `운영자`라는 단어가 포함된 경우
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("닉네임을 입력하세요");
			String nick = sc.next();
			sc.close();

			if (nick.length() > 6 || nick.length() < 2 || nick.contains("운영자")) {
				throw new Exception("잘못입력했습니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
