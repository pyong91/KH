package loop;

public class Test04 {

	public static void main(String[] args) {
//		횟수측정
//		 - 1부터 100사이의 짝수 개수 세기
		
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				count++;
//				System.out.println(++count);
			}
		}
		
		System.out.println("짝수 개수 = " + count);

	}

}
