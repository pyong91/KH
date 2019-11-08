package api.io.file;

import java.io.File;

public class Tset01 {

	public static void main(String[] args) {
//		파일 : 글자의 모음
//		자바에서 파일은 어떤 클래스로 관리하는가? java.io.File
		
		File a = new File("D:/sample.txt");
		File b = new File("D:\\sample.txt");
		File c = new File("D:/", "sample.txt");
		
//		존재 검사
		System.out.println(a.exists());
		System.out.println(b.exists());
		System.out.println(c.exists());
		
//		정보 확인: 이름, 위치. 크기
		System.out.println(a.getName());
		System.out.println(a.getPath());
		System.out.println(a.length());
		
		System.out.println(a.lastModified()); // 수정시각(기준시:1970년 1월 01일 0:4\0부0
		
		System.out.println(a.isHidden());	// 숨김여부 확인
		System.out.println(a.canRead());	// 일기전용?
		System.out.println(a.canWrite());	// 쓰기전용?
		
	}

}
