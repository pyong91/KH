package loop;

public class Test02 {

	public static void main(String[] args) {
//		1부터 100미만의 정수 중에서 5가 들어있는 숫자만 화면에 출력하고 싶습니다.
		
		for(int i = 1; i<100; i++) {
			if(i % 10 == 5 || i / 10 == 5) {
				System.out.println(i);
			}
		}
		
	}

}
