package api.lang.string;

public class Test01 {

	public static void main(String[] args) {
//		String 클래스 객체 생성
		String a = "Hello";
		String b = new String("Hello");
		String c = "Hello";
		String d = new String("Hello");
		
		System.out.println(a == c);
		System.out.println(b == d);
		System.out.println(a == d);
		System.out.println(b.equals(d));
		
		
	}

}
