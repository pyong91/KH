package array;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		변수 : 단일 저장소
//		배열 : 다중 저장소
//		예 : 변수를 이용하여 숫자 5개를 저장 후 출력
//		 -> 배열을 5칸 만든다
//		 -> t(리모컨) ---------> [ 0 ] [ 0 ] [ 0 ] [ 0 ] [ 0 ]
		int size = 5;
		int[] t = new int[size];
		int total = 0;;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요");
		for (int i = 0; i < size; i++) {
			t[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < size; i++) {
			System.out.println("t["+i+"] = " + t[i]);
			total += t[i];
		}		
		System.out.println(total);
	}

}
