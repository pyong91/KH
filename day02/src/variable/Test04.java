package variable;

public class Test04 {

	public static void main(String[] args) {
		//문제 : 세 자리 정수 175라는 숫자가 있을 때 이 숫자를 각 자리별로 분해하여 출력
		// 출력 예시 : 1
		//			7
		//			5
		int a = 175;
			
		System.out.println(a / 10 / 10);
		System.out.println(a / 10 % 10);
		System.out.println(a % 10);

		
		System.out.println(a % 10);
		a = a / 10;
		System.out.println(a % 10);
		a = a / 10;
		System.out.println(a % 10);
	}

}
