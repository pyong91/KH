package array;

import java.util.Random;

public class Test12 {
	public static void main(String[] args) {
//		이번주 로또번호를 추첨하여 화면에 출력
//		 - 로또는 1부터 45까지 무작위로 6개의 숫자를 추첨합니다.
//		 - 단, 똑같은 숫자는 나올 수 없습니다.

		Random r = new Random();

		int[] ary = new int[6];
		int n;
//		for (int i = 0; i < ary.length; i++) {
//			n = r.nextInt(45) + 1;
//			for(int j = 0; j < i; j++) {				
//				if(n==ary[j]) {
//					n = r.nextInt(45) + 1;
//					j = -1;
//				} 
//			}
//			ary[i] = n;
//		}		
//		for(int a : ary) {
//			System.out.print(a + " ");
//		}
//		
		
//		중복제거알고리즘
		for (int i = 0; i < ary.length; i++) {
			ary[i] = r.nextInt(6) + 1;
			for (int j = 0; j < i; j++) {
				if (ary[i] == ary[j]) {
					System.out.println("중복!");
					i--;
					break;
				}
			}
		}
		for (int a : ary) {
			System.out.print(a + " ");
		}

	}
}
