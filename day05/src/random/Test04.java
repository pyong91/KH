package random;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
//		랜덤으로 "앞" 또는 "뒤" 라는 글자 중 1개를 화면에 출력하고 싶습니다.
//		0 = "앞", 1 = "뒤"
		
		Random r = new Random();
		int n = r.nextInt(2);
		System.out.println(n);
		String result;
		
		if(n == 0) {
			result = "앞";
//			System.out.println("앞");
		}
		else {
			result = "뒤";
//			System.out.println("뒤");
		}
		System.out.println(result);
	}

}
