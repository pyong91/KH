package string;
import java.lang.*;

public class Test03 {

	public static void main(String[] args) {
//		문자열 : 자바에 존재하는 가장 특이한 형태
//				기본 제공되는 자료형태가 아님
//				기본 형태처럼 사용이 가능
//				참조형 데이터
		
		String a = "Hello";
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(a.isEmpty());
		System.out.println(a.charAt(1));
		
//		문제 : a의 마지막 글자를 화면에 출력
		System.out.println(a.charAt(a.length() - 1));
		
//		특징 : 기본연산은 안되지만 특별히 "더하기"는 가능
		
		String b = "KH";
		System.out.println(b + "정보교육원");
		System.out.println(b + 100); // str + int -> 문자열(str)
		
		int c = 10;
		int d = 20;
		System.out.println(c + d);
		System.out.println("합계 : " + c + d);	// str + int -> str + int -> str
		
		
	}

}
