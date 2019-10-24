package condition2;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		내년(2020년)은 2월이 29일까지 있습니다.
//		랜덤을 이용하여 내년 중 무작위로 날짜를 1개 뽑아서 출력
//		출력 예 : 2020년 ??월 ??일
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int month, day, max, year;
		boolean isLeap = false;

//		입력
		System.out.println("연도(네자리)를 입력하세요");
		year = sc.nextInt();
		
//		윤년계산
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("입력하신 연도는 윤년입니다");
			isLeap = true;
		} else {
			System.out.println("입력하신 연도는 평년입니다");
		}
		
//		월 뽑기, 최대일수(max) 입력
		month = r.nextInt(12) + 1;
		switch(month) {
		case 4: case 6: case 9: case 11: 
			max = 30; break;
		case 2: max = isLeap == true ? 29 : 28; break;
		default : max = 31;
		}
		
//		일 뽑기
		day = r.nextInt(max) + 1;
		
//		출력
		System.out.println(year + "년 " + month + "월 " + day + "일");
//		System.out.println(max);
	}

}
