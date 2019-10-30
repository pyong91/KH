package array;

import java.util.Random;

public class Test14 {

	public static void main(String[] args) {
//		Test13.java와 같은 형태의 배열을 준비한 뒤 이 배열을 "무작위"로 섞어서 출력
//		무작위라는 것은 너무 추상적인 단어이므로 다음과 같이 정의합니다.
//		 - 모든 자리가 1번씩 위치가 바뀌어야 합니다.
//		 - 바뀔 대상의 자리는 같은 자리일 수 없습니다.(예 : 1번 위치와 1번 위치 교체는 불가)
//		 - 즉, 모든자리가 1번씩 자신이 아닌 다른 위치와 교체되면 "무작위"로 섞였다고 간주합니다.
		Random r = new Random();

		String[] str = new String[] { "치토스", "허니버터칩", "새우깡", "프링글스", "스윙칩" };
		String temp;
		int randomIndex;

		System.out.print("시작 목록 : ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < str.length; i++) {
			randomIndex = r.nextInt(str.length);
			if (i == randomIndex) {
				i--;
			} else {
				System.out.println(str[i] + " <-> " + str[randomIndex] + " 교체");
				temp = str[randomIndex];
				str[randomIndex] = str[i];
				str[i] = temp;
				
				for (int j = 0; j < str.length; j++) {
					System.out.print(str[j] + " ");
				}
				System.out.println();
			}
		}

	}
}