package condition2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
//		사용자에게 월을 입력받아 해당하는 월의 날짜수를 구하여 출력
//		2월은 28일까지 있다고 가정합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 달을 입력하세요");
		int n = sc.nextInt();
		sc.close();
		
		int result;
		
		switch(n) {
		case 4: case 6: case 9: case 11: 
			result = 30; break;
		case 2: result = 28; break;
		default : result = 31;
		}

		System.out.println(result + "일까지 있습니다");
	}

}
