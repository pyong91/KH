package condition;

public class Test03 {

	public static void main(String[] args) {

		int count = 2;	 	// 인원수
		int price = 5000;	// 1명당 가격

		int total = count * price;

//		조건 : 3명 이상부터는 1인당 2천원 할인
		if (count >= 3) {
			System.out.println("할인");
			total -= count * 2000;
		}
		System.out.println(total);
	}

}
