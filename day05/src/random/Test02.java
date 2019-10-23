package random;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
//		다음 형태의 랜덤값을 구하여 화면에 출력
//		1. 주사위 1개를 던진 결과
//		2. 이번주 로또번호 1개를 추첨한 결과
//		3. 무작위 두자리 정수 1개
//		4. OTP 번호 1개(6자리정수)
		
		Random r = new Random();
		
		int n1, n2, n3, n4;
				
		n1 = r.nextInt(6) + 1;
		System.out.println("주사위 : " + n1);
		
		n2 = r.nextInt(45) + 1;
		System.out.println("로또 : " + n2);
		
		n3 = r.nextInt(90) + 10;
		System.out.println("두자리 정수 : " + n3);
		
		n4 = r.nextInt(1000000);
		System.out.println("OTP : " + n4);
		
	}

}
