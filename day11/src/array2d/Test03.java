package array2d;

public class Test03 {

	public static void main(String[] args) {
//		2차원 배열을 이용하여 다음 모양으로 데이터 초기화 후 출력
		int col = 5;
		int row = 5;
		int[][] a = new int[col][row];
		int n = 1;
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				a[i][j] = n;
				n++;
			}
		}
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println();
		
		
		n = 1;
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				a[j][i] = n;
				n++;
			}
		}
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
