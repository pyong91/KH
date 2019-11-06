package api.lang.string;

public class Test05 {

	public static void main(String[] args) {
//		문자열 편집
//		String.trim 좌우공백제거
		String url = "                    http://www.naver.com                       ";
		System.out.println(url);
		System.out.println(url.trim());
		url = url.trim();

		String find = "naver";
		int start = url.indexOf(find);
		int end = start + find.length();

		if (url.contains(find)) {
			System.out.println(url.substring(start, end));
		}
		
//		문자열 분해
		String song = "학교종이 땡땡땡 어서모여라";
		String[] songAry = song.split(" ");
		System.out.println(songAry.length);
		
//		문자열 치환
		String str = "나는 카레가 싫어요";
		System.out.println(str.replace("싫어요", "좋아요"));
		
//		체이닝(chaining) : 메소드를 연쇄적으로 사용하는것
		System.out.println(str.replace("싫어요", "좋아요").replace("카레", "자바"));
		
	}

}
