package array2d;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		Random r = new Random();
		int size = 5;
		int[][] a = new int[size][size];
		
		for (int i = 0; i < size*size; i++) {
			int col = r.nextInt(size);
			int row = r.nextInt(size);
			if(a[col][row] != 0) {
				i--;
			} else {
				a[col][row] = i+1;
//				System.out.println(col + " " + row + " " + n);
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
