package bingo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("빙고 사이즈 입력 : ");
		int size = sc.nextInt();

		Bingo com = new Bingo("computer", size);
		Bingo player = new Bingo("player", size);

		
//		*************************************************
		while (true) {
//		출력
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			com.print();
			player.print();

//		입력, 체크
			System.out.print("숫자를 입력하세요 : ");
			int inputNumber = sc.nextInt();
			com.deleteNumber(inputNumber);
			player.deleteNumber(inputNumber);
			
//		게임오버 조건 // 안됨...
			if(com.checkBingo()==size || player.checkBingo()==size) break;
		}
//		*************************************************

//		ㅁ 빙고 체크 만들기
//		ㅁ 컴퓨터가 랜덤 번호 뽑게 하기
		
		
	}

}
