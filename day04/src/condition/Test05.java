package condition;
import java.util.Scanner;
import java.lang.*;

public class Test05 {

	public static void main(String[] args) {
//		사용자에게 숫자 2개를 입력받습니다.
//		두 수의 차이를 구하여 화면에 출력
//		(숫자의 순서와 관계 없이 차이는 항상 0이상으로 나와야 합니다)
		int a, b, c; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		b = sc.nextInt();
		sc.close();
		
		c = 0;
		
		if(a > b) {
			c = a - b;
		}
		
		if(a < b) {
			c = b - a;
		}
		
		System.out.println("두 수의 차이는 " + c + "입니다");
		
	}
}
