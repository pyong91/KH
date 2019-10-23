package random;

import java.util.Random;

public class Test05_1 {

	public static void main(String[] args) {

//		윷놀이 한턴을 구현
//		1. 도/개/걸/윷/모/빽도 중 1개가 랜덤으로 출력되는 프로그램을 구현
//		2. 상대적으로 잘 나오고 안 나오는 항목들을 고려하여 출력하도록 구현
//		3. 앞 40%, 뒤60% 

		int yut;
		String result;
		Random r = new Random();
		
		yut = r.nextInt(16);

		if (yut == 0) {
			result = "빽도!";
		}
		else if (yut <= 3) {
			result = "도";
		}
		else if (yut <= 9) {
			result = "개";
		}
		else if (yut <= 13) {
			result = "걸";
		}
		else if (yut == 14) {
			result = "윷";
		}
		else {
			result = "모";
		}
		
		System.out.println(result);
		
	}

}
