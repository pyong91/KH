package random;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {

//		윷놀이 한턴을 구현
//		1. 도/개/걸/윷/모/빽도 중 1개가 랜덤으로 출력되는 프로그램을 구현
//		2. 상대적으로 잘 나오고 안 나오는 항목들을 고려하여 출력하도록 구현
//		3. 앞 40%, 뒤60% 

		int v1, v2, v3, b;
		int sum;
		String result;
		Random r = new Random();
			
		v1 = r.nextInt(2);
		v2 = r.nextInt(2);
		v3 = r.nextInt(2);
		b = r.nextInt(2);
		
//		if(r.nextInt(10) < 4) {
//			v1 = 0;
//		}
//		else {
//			v1 = 1;
//		}

		sum = v1 + v2 + v3 + b;

		if (sum == 0) {
			result = "모!";
		} else if (sum == 1) {
			result = b > 0 ? "빽도!" : "도!";
		} else if (sum == 2) {
			result = "개!";
		} else if (sum == 3) {
			result = "걸!";
		} else {
			result = "윷!";
		}
		
		System.out.println(""+v1+v2+v3+b);
		System.out.println(result);
		
		
	}

}
