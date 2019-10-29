package array;

public class Test05 {

	public static void main(String[] args) {
//		다음 형태로 배열을 만들고 요구하는 정보를 출력하세요
//		a ----> [10][20][0][50][30][40]
//		1. +2 지점 출력
//		2. +1 지점과 +4 지점 합계 출력
//		3. 배열 칸 수 출력
//		4. 전체 데이터 출력
		
		int[] a = {10, 20, 0, 50, 30, 40};
		
		System.out.println();
		
//		1. +2 지점 출력
		System.out.println("+2 지점 출력");
		System.out.println(a[2]);

//		2. +1 지점과 +4 지점 합계 출력
		System.out.println("+1 지점과 +4 지점 합계 출력");
		System.out.println(a[1] + a[4]);

//		3. 배열 칸 수 출력
		System.out.println("배열 칸 수 출력");
		System.out.println(a.length);
		
//		4. 전체 데이터 출력
		System.out.println("전체 데이터 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);			
		}
		
	}

}
