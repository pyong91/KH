package loop;

public class Test15 {

	public static void main(String[] args) {
		
//		1부터 10사이의 홀수를 출력
		
		for(int i = 1; i<=10; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 ==0) continue;
			System.out.println(i);
		}
	}

}
