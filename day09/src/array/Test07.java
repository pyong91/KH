package array;

public class Test07 {

	public static void main(String[] args) {
//		10, 20, 30, 40, 50 을 배열에 저장하고 다음 작업을 수행
//		1. 10과 40의 위치를 변경
//		2. 20과 30의 위치를 변경
//		3. 전체 출력
//		4. 전체 합계 출력
		
		int[] a = new int[]{10, 20, 30, 40, 50};
		int temp;
		int total = 0;
//		1.
		temp = a[0];
		a[0] = a[3];
		a[3] = temp;
//		2.
		temp = a[1];
		a[1] = a[2];
		a[2] = temp;
//		3, 4
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			total += a[i];
			System.out.println(total);
		}

	}

}
