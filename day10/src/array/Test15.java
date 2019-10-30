package array;

import java.util.Random;

public class Test15 {

	public static void main(String[] args) {
//		주사위를 1000번 던졌을 때 각각의 숫자가 몇 번씩 나왔는지를 세고 싶습니다.
//		프로그램을 만들어서 해당 기능을 구현하세요
		Random r = new Random();
		int[] countAry = new int[45];
		int n;
		
		for (int i = 0; i < 1000; i++) {
			n = r.nextInt(45);
			countAry[n]++;
		}
		
		for(int i = 0; i<countAry.length; i++) {
			System.out.println((i+1) + " 나온횟수 : " + countAry[i] + "번");
		}
	}

}
