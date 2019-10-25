package loop;

public class Test09 {
	public static void main(String[] args) {
//		부자가 되기 위해서 KH뱅크에 계좌를 만들고 돈을 모을 계획입니다.
//		일단은 30일정도 모아보려고 하는데...
//		 - 첫날은 돈이 없으니깐 1원만 예금
//		 - 둘째날부터는 전날의 2배를 예금
//		30일동안 모을 수 있는 금액과 일자별 예금액을 출력
		
		int money = 1;
		int total = 0;
		
		for(int i = 1; i <=30; i++) {
			System.out.print(i + "일차 : ");
			System.out.println(money);
			total += money;
			money *= 2;
		}
		System.out.println("합계 : " + total + "원");
		
		long l_money = 1l;
		long l_total = 0l;
		
		for(int i = 1; i <=40; i++) {
			System.out.print(i + "일차 : ");
			System.out.println(l_money);
			l_total += l_money;
			l_money *= 2;
		}
		System.out.println("합계 : " + l_total + "원");
	}
}
