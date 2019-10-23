package random;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
//		랜덤으로 카드 한 장을 뽑는 프로그램 구현
//		♠♣♥♦

		Random r = new Random();

		int n = r.nextInt(4);
		int number = r.nextInt(13) + 1;
		String type;
		String card;	
		
//		System.out.println(n);
		
		if(n == 0) {
			type = "♠";
		}
		else if(n == 1) {
			type = "♣";
		}
		else if(n == 2) {
			type = "♥";
		}
		else{
			type = "♦";
		}
		
		
		if(number == 1) {
			card = type + "A";
		}
		else if(number == 11) {
			card = type + "J";
		}
		else if(number == 12) {
			card = type + "Q";
		}
		else if(number == 13) {
			card = type + "K";
		}
		else {
			card = type + number;
		}
		
//		System.out.println(number);
		System.out.println(card);
		
	}

}
