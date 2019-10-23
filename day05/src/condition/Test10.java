package condition;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
//		사용자에게 숫자를 한개 입력받아서 2의 배수인지, 3의 배수인지 판정 후 출력
//		2, 3 모두의 배수인 경우		6, 12 ...
//		2의 배수이지만 3의 배수는 아닌 경우	4, 8 ...
//		3의 배수이지만 2의 배수는 아닌 경우	3, 9 ...
//		둘 다 아닌 경우				5, 7 ...
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		sc.close();
		
		if(n % (2 * 3) == 0) {
			System.out.println("2, 3의 배수");
		}
		else if(n % 3 == 0) {
			System.out.println("3의 배수");
		}
		else if(n % 2 == 0) {
			System.out.println("2의 배수");
		}
		else {
			System.out.println("둘다 아님");
		}
		
	}

}
