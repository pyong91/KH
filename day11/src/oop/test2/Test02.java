package oop.test2;

public class Test02 {

	public static void main(String[] args) {
//		다음 정보를 클래스와 객체를 이용하여 프로그래밍 데이터화 시키고 출력

//		역대 동계올림픽 선수 메달 현황
//		 - 이름 : 김연아, 종목 : 피겨스케이팅, 금메달 : 3개, 은메달: 2개, 동메달: 2개
//		 - 이름 : 이상화, 종목 : 스피드스케이팅, 금메달 : 4개, 은메달: 2개, 동메달: 3개
//		 - 이름 : 김동성, 종목 : 쇼트트랙, 금메달 : 2개, 은메달: 5개, 동메달: 1개

		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		p1.name = "김연아";
		p1.event = "피겨스케이팅";
		p1.gold = 3;
		p1.silver = 2;
		p1.bronze = 2;
		
		p2.name = "이상화";
		p2.event = "스피드스케이팅";
		p2.gold = 4;
		p2.silver = 2;
		p2.bronze = 3;
		
		p3.name = "김동성";
		p3.event = "쇼트트랙";
		p3.gold = 2;
		p3.silver = 5;
		p3.bronze = 1;
		
		System.out.println("이름 : " + p1.name);
		System.out.println(" 종목 : " + p1.event);
		System.out.println(" 금메달 : " + p1.gold);
		System.out.println(" 은메달 : " + p1.silver);
		System.out.println(" 동메달 : " + p1.bronze);
		
		System.out.println("이름 : " + p2.name);
		System.out.println(" 종목 : " + p2.event);
		System.out.println(" 금메달 : " + p2.gold);
		System.out.println(" 은메달 : " + p2.silver);
		System.out.println(" 동메달 : " + p2.bronze);
		
		System.out.println("이름 : " + p3.name);
		System.out.println(" 종목 : " + p3.event);
		System.out.println(" 금메달 : " + p3.gold);
		System.out.println(" 은메달 : " + p3.silver);
		System.out.println(" 동메달 : " + p3.bronze);
		
	}

}
