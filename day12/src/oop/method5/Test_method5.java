package oop.method5;

public class Test_method5 {

	public static void main(String[] args) {
//		다음 요구사항을 구현하시오
//		오락실에서 보유한 게임기 목록
//		 - 이름 : 1945, 한판가격 : 500원, 누적수입 : 0원
//		 - 이름 : 펌프, 한판가격 : 1000원, 누적수입 : 0원
//		 - 이름 : 사격, 한판가격 : 2000원, 누적수입 : 0원
//		각각의 게임기를 만든 뒤, 다음 횟수만큼 게임을 플레이 시켰을 때의 정보를 출력하세요
//		1945 - 20회, 펌프 - 15회, 사격 - 4회
		
		Game game1 = new Game();
		Game game2 = new Game();
		Game game3 = new Game();
		
		game1.set("1945", 500);
		game2.set("펌프", 1000);
		game3.set("사격", 2000);
		
		game1.play(20);
		game2.play(15);
		game3.play(4);
		
		game1.print();
		game2.print();
		game3.print();
	}

}
