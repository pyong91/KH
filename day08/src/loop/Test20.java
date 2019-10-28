package loop;

public class Test20 {

	public static void main(String[] args) {
//		화면에 0시 0분 0초부터 23시 59분 59초까지 출력하세요
		
		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				for (int k = 0; k <= 59; k++) {
					System.out.println(i + "시 " + j + "분 " + k +"초");
				}
			}
		}
		
	}

}
