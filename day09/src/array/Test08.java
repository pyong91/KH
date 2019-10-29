package array;

public class Test08 {

	public static void main(String[] args) {
//		다음 단어들을 배열에 저장한 뒤 문제를 푸세요
//		 -자바, 파이썬, 루비, HTML, CSS
		String[] strAry = new String[] {"자바", "파이썬", "루비", "HTML", "CSS"};
		
//		1. 모든 단어 출력
		for(String s : strAry) {
			System.out.print(s + " ");
		}
		System.out.println();
		
//		2. 모든 단어별 글자수 출력
		for(String s : strAry) {
			System.out.println(s + " 글자수 :" + s.length());
		}
		
//		3. "자바"와 "HTML"의 위치를 변경
		String temp = strAry[0];
		strAry[0] = strAry[3];
		strAry[3] = temp;
		
		for(String s : strAry) {
			System.out.print(s + " ");
		}
	}

}
