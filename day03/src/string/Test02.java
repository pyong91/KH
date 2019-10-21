package string;

public class Test02 {

	public static void main(String[] args) {
//		K 라는 알파벳을 변수에 저장한 뒤 다음을 검사하여 출력
//			1.변수에 저장된 데이터가 "대문자 알파벳"인지 검사 후 출력
//			2.변수에 저장된 데이터가 "소문자 알파벳"인지 검사 후 출력
//			3.변수에 저장된 데이터가 "알파벳"인지 검사 후 출력
//			A = 65, Z = 90, a = 97, z = 122
		
		char val = 'K';
		boolean upper = val >= 'A' && val <= 'Z';
		boolean lower = val >= 'a' && val <= 'z';
		
//		1.대문자?
//		System.out.println(val >= 65 && val <= 90);
		System.out.println(val >= 'A' && val <= 'Z');
		
		
//		2.소문자?
//		System.out.println(val >= 97 && val <= 122);
		System.out.println(val >= 'a' && val <= 'z');
		
//		3.알파벳?
		System.out.println(upper || lower);
		
//		문제 : 위의 글자가 "한글"인지 검사하여 출력
		System.out.println(val >= '가' && val <= '힣');
		System.out.println('가');
		
	}
}
