package input;

import java.util.Calendar;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		사용자에게 숫자 형태로 8자리 생년월일을 입력받습니다.
//		이 사용자의 출생년도, 월, 일을 따로따로 계산하여 출력
//		입력 예 : 20000105
//		출력 예 : 2000
//			   1
//			   5
		Scanner sc = new Scanner(System.in);
		int birth, y, m, d, age;
		
		birth = sc.nextInt();
		sc.close();
		
		y = birth / 10000;			// 년 
		m = birth / 100 % 100;		// 월
		d = birth % 100;			// 일
		age = Calendar.getInstance().get(Calendar.YEAR) - y + 1;
		
//		출력
		System.out.println(y + "년");
		System.out.println(m + "월");
		System.out.println(d + "일");
		System.out.println(age + "세");

	}

}
