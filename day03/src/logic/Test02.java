package logic;

public class Test02 {

	public static void main(String[] args) {
//		문제
//		다음을 계산하는 프로그램을 만드세요
//		자장면 한그릇에 5000원, 짬뽕 한그릇에 6000원인 중국집이 있습니다.
//		30000원 이상 구매시 15% 할인 행사를 진행하고 있다고 할 때,
//		자장면 4그릇, 짬뽕 2그릇을 주문하면 할인 대상이 되는지 계산하여 출력하세요
		
		int ja = 4;
		int jaPrice = 5000;
		int jjam = 2;
		int jjamPrice = 6000;
		
		int jaTotal = ja * jaPrice;
		int jjamTotal = jjam * jjamPrice;
		int total = jaTotal + jjamTotal;
		
		boolean result = total >= 30000;
		
		System.out.println(total);
		System.out.println(result);
		
	}

}
