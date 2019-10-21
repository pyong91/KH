package logic;

public class Test03 {

	public static void main(String[] args) {
//		어떤 사람의 생년월일이 숫자로 다음과 같이 주어져 있다고 가정합니다
//		- 19990217
//		이 사람이 "성인" 인지 판정하여 출력하세요
//		성인은 한국 나이로 20세 이상을 말합니다.
		
		int n = 19990217;
		int adult = 20000101;
		boolean result = n <= adult;
		System.out.println(result);
		
		n = n / 10000;
		adult = 2000;
		result = n <= adult;
		System.out.println(n);
		System.out.println(result);
		
	}

}
