package logic;

public class Test08 {

	public static void main(String[] args) {
//		다음 제시하는 내용을 프로그래밍 코드로 구현하세요.
//		"홀수"이지만 3의 배수는 아닌 숫자를 판정할 수 있는 프로그램 구현
//		279라는 숫자를 이용하여 위의 프로그램을 실행한 뒤 결과 출력
		
		int number = 279;
		boolean result = number % 2 != 0 && number % 3 != 0;
		System.out.println(result);
		
	}

}
