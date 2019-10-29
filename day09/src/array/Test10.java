package array;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
//		사용자에게 5개의 숫자를 입력받아 복사본을 생성
//		복사본을 생성한 뒤 기존에 입력받은 배열의 모든 데이터에 +1 작업을 수행
//		원본과 복사본을 모두 출력		
		
		Scanner sc = new Scanner(System.in);
		
		int[] userAry = new int[5];
		int[] copyAry = new int[userAry.length];
		
		for (int i = 0; i < userAry.length; i++) {			
			userAry[i] = sc.nextInt();
			copyAry[i] = userAry[i] + 1;
		}

		System.out.print("입력받은 배열 : ");
		for(int n : userAry) {
			System.out.print(n + " ");
		}
		System.out.print("\n" + "복사한 배열 : ");
		for(int n : copyAry) {
			System.out.print(n + " ");
		}
	}

}
