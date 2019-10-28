package loop;

import java.util.Random;

public class Test30 {

	public static void main(String[] args) {
//		로또 1등에 당첨될 확률이 0.02%라고 가정합니다.
//		로또는 한장에 1000원입니다.
//		로또에 당첨되기 위해 필요한 금액을 시뮬레이션으로 계산하여 출력하세요.
//		한 번만 하면 운이 좋은 경우도 있을 수 있기 때문에 1000번 정도 테스트하여 평균값을 출력하세요

		Random r = new Random();
		int price = 1000;
		int n, sum;
		long total = 0;

		n = r.nextInt(5000);

		for (int i = 1; i <= 1000; i++) {
			sum = 0;
			while (n != r.nextInt(5000)) {
				sum += price;
			}
			System.out.println(i + "회차 " + sum + "원");
			total += sum;
		}
		System.out.println("1000회 결과 총 " + total + "원");
		total /= 1000;
		System.out.println("1000번 평균 " + total + "원");
	}

}
