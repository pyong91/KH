package condition2;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
//		사용자에게 "통신사"와 "전화번호"를 입력받아 출력하는 프로그램 구현
//		단, 통신사는 다음에 제시된 것만 허용됩니다.
//		 - 통신사 : LG, SKT, KT, 알뜰폰
//		전화번호는 010으로 시작합니다.
//		사용자에게 입력받은 값을 검사해서 검사 결과에 따라 다른 알림을 주세요.
		Scanner sc = new Scanner(System.in);
		
		String comp, number;
		boolean isComp = false, 
				isNumber = false;
		char a, b, c;
		
//		입력
		System.out.println("통신사를 입력하세요");
		comp = sc.next();
		System.out.println("전화번호를 입력하세요");
		number = sc.next();
		comp = comp.toUpperCase();
		
//		통신사 검사
		switch(comp) {
		case "LG": case "SKT": case "KT": case "알뜰폰": 
			isComp = true; break;
		default : isComp = false;
		}
		
//		번호 검사
		a = number.charAt(0); 
		b = number.charAt(1);
		c = number.charAt(2);
		if(a == '0' && b == '1' && c == '0' && number.length() == 11) {
			isNumber = true;
		}
		
//		출력
		if(isComp && isNumber) {
			System.out.println("잘 입력했습니다");
		} else if(!isComp && isNumber){
			System.out.println("통신사를 잘못입력했습니다");
		} else if(!isNumber && isComp) {
			System.out.println("전화번호를 잘못입력했습니다");			
		} else {
			System.out.println("둘 다 잘못입력했습니다");
		}
		
	}
}
