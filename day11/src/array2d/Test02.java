package array2d;

public class Test02 {

	public static void main(String[] args) {
//		2차원 배열을 이용하여 다음 모양으로 데이터를 저장한 뒤 출력
		
		int[][] a = new int[][]{
			{8, 1, 6},
			{3, 5, 7},
			{4, 9, 2}
		};
		
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
