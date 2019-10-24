package condition2;

public class Test01 {

	public static void main(String[] args) {
		int season = 10;
		
		if(season == 9 || season == 10 || season == 11) {
			System.out.println("가을");
		}
		else if(season == 6 || season == 7 || season == 8) {
			System.out.println("여름");
		}
		else if(season == 3 || season == 4 || season == 5) {
			System.out.println("봄");
		}
		else {
			System.out.println("겨울");
		}
		
	}

}
