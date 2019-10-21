package logic;

public class Test09 {

	public static void main(String[] args) {
//		&, &&의 차이
//		&는 양쪽을 다 실행해서 비교한다.
//		&&는 불필요하다고 판단하는 경우는 스킵한다. (앞이 false인 경우 뒤는 실행 안함)	
		
		int a = 10;
		int b = 12;
		
		boolean r1 = a == b && ++a > b;
		System.out.println(a);
		boolean r2 = a == b && ++a > b;
		System.out.println(a);
		boolean r3 = a == b && ++a > b;
		System.out.println(a);
		boolean r4 = a == b && ++a > b;
		System.out.println(a);
		boolean r5 = a == b && ++a > b;
		System.out.println(a);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		r1 = a == b & ++a > b;
		System.out.println(a);
		r2 = a == b & ++a > b;
		System.out.println(a);
		r3 = a == b & ++a > b;
		System.out.println(a);
		r4 = a == b & ++a > b;
		System.out.println(a);
		r5 = a == b & ++a > b;
		System.out.println(a);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}

}
