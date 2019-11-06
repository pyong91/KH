package api.lang.string;

public class Test06 {
	public static void main(String[] args) {
//		원시 자료형과 문자열과의 상호 변환
		int a = 100;
		String b = "";
		b += a;	
		System.out.println(b);
		
		String c = String.valueOf(a);
		System.out.println(c);
		
		String d = "123";
//		int e = d;
//		int e = (int)d;
		int e = Integer.parseInt(d);
		System.out.println(e);
		
	}
}
