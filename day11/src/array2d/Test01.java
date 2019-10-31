package array2d;

public class Test01 {

	public static void main(String[] args) {
//		2차원 배열
//		[1]선언만
//		[2]선언+생성
//		[3]선언+생성+초기화
		
		int[][] a;
		
		int[][] b = new int[2][3];
		
		System.out.println(b.length);
		System.out.println(b[0].length);
		
		int[][] c = new int[][] {
			{7, 5, 2}, 
			{1, 6, 9}
		};
		
		System.out.print(c[0][0]);
		System.out.print(c[0][1]);
		System.out.print(c[0][2]);
		
		System.out.println();
		
		System.out.print(c[1][0]);
		System.out.print(c[1][1]);
		System.out.print(c[1][2]);
		
	}

}
