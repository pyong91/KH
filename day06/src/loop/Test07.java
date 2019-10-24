package loop;

public class Test07 {

	public static void main(String[] args) {
//		다이어트를 위해 30일간 운동계획을 작성하려고 합니다.
//		 - 첫날은 워밍업으로 팔굽혀펴기 10개만 합니다.
//		 - 둘째날부터는 전날보다 4개씩 더 합니다.
//		출력 :
//		 - 매일매일 하게되는 팔굽혀펴기 개수
//		 - 30일동안 하게되는 팔굽혀펴기 개수

		int day = 10;
		int total = 0;
		
		for(int i=0; i<30; i++) {
			System.out.println((i+1) + "번째날 : " + day + "개");
			total += day;
			day += 4;
		}
		
		System.out.println("총 개수 : " + total + "개");
	}

}
