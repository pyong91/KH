package bingo;

import java.util.Random;

public class Bingo {
	private Random r = new Random();
	private String name;
	private int size;
	private int[][] bingo;
	private int bingoCount = 0;

	public Bingo(String name, int size) {
		this.name = name;
		this.size = size;
		bingo = createBingo();
	}

	public int[][] getBingo() {
		return this.bingo;
	}

	public int[][] createBingo() {
		bingo = new int[size][size];
		for (int i = 0; i < size * size; i++) {
			int col = r.nextInt(size);
			int row = r.nextInt(size);
			if (bingo[col][row] != 0) {
				i--;
			} else {
				bingo[col][row] = i + 1;
			}
		}
		return bingo;
	}

	public void print() {
		System.out.println();
		System.out.println(name);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (bingo[i][j] == 0)
					System.out.print("X\t");
				else
					System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void deleteNumber(int inputNumber) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (inputNumber == bingo[i][j]) {
					bingo[i][j] = 0;
					break;
				}
			}
		}
	}
	
//	미완성
	public void checkBingo() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(bingo[i][j] != 0) break;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
