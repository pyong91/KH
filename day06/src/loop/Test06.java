package loop;

public class Test06 {

	public static void main(String[] args) {
//		목표 : 1부터 10까지의 합계를 계산
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		System.out.println(total);
	}

}