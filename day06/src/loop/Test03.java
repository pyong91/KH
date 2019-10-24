package loop;

public class Test03 {

	public static void main(String[] args) {
//		1부터 100미만의 정수 중에서 3,6,9 게임에서 박수치는 숫자만 출력

		for(int i = 1; i < 100; i++) {
			
			boolean three = i / 10 == 3 || i % 10 == 3;
			boolean six = i / 10 == 6 || i % 10 == 6;
			boolean nine = i / 10 == 9 || i % 10 == 9;
			
				if(three || six || nine) {
					System.out.println(i);
			}
		}
	
	}
}
