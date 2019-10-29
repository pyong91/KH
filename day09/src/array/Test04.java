package array;

public class Test04 {

	public static void main(String[] args) {
//		배열의 생성과 접근
//		숫자 5개를 저장할 배열 생성
//		 - 배열은 참조형이다
		
		int[] a = new int[5];
		a[0] = 1;
		System.out.println(a);
		
		int b[] = new int[5];
		System.out.println(b);
		System.out.println(b.length);
		
		int[] c;
//		System.out.println(c);
//		System.out.println(c.length);
		
		int[] d = null;
		System.out.println(d);
//		System.out.println(d.length);
		
//		new는 만듦과 동시에 초기화를 진행(초기값으로)
		
	}

}
