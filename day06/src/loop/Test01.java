package loop;

public class Test01 {

	public static void main(String[] args) {
//		반복(loop) : 똑같거나 규칙이 있는 코드를 계속 실행하기 위한 방법
//		1. "Hello Java" 5번 출력
//		2. 1부터 100까지 정수를 화면에 출력
//		3. a부터 z까지 소문자 알파벳을 화면에 출력
//		4. 1부터 100까지 홀수를 화면에 출력
//		5. 10부터 0까지 진행되는 카운트 다운을 구현

//		1. "Hello Java" 5번 출력
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello Java");
		}

//		2. 1부터 100까지 정수를 화면에 출력
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

//		3. a부터 z까지 소문자 알파벳을 화면에 출력
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}

//		4. 1부터 100까지 홀수를 화면에 출력
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}

//		5. 10부터 0까지 진행되는 카운트 다운을 구현
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

	}
}