package logic;

public class Test06 {

	public static void main(String[] args) {
//		어떤 숫자가 2, 3, 5, 7의 배수일 경우 이 숫자는 "아리수"라고 합니다.
//		2730이 "아리수"인지 판단하여 출력
		
//		int ari = 2730;
//		boolean result = ari % 2 == 0 && ari % 3 == 0 && ari % 5 == 0 && ari % 7 ==0;
//		System.out.println(result);
//			
//		입력
		int number = 2730;
		
//		계산
		boolean arisu = number % 2 == 0
						&& number % 3 == 0
						&& number % 5 == 0
						&& number % 7 == 0;
		boolean arisu2 = number % (2 * 3 * 5 * 7) == 0;
//		출력
		System.out.println(arisu);
		System.out.println(arisu2);
	}

}
