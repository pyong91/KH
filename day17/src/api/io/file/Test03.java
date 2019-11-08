package api.io.file;

import java.io.File;

public class Test03 {

	public static void main(String[] args) {
//		디렉터리(directory) : 파일을 분류하기 위한 도구(크기가 없다)
		
//		절대 경로 (absolute path)
		File a = new File("C:/Users/user1/Desktop/KH2/Git/KH/day17/test");
		
//		상대 경로 (relative path) : 프로그램(프로젝트) 기준으로 산정하는 경로
		File c = new File("test");
		
		System.out.println(a.exists());
		System.out.println(c.exists());
		System.out.println(a.isFile());
		System.out.println(c.isFile());
		System.out.println(a.isDirectory());
		System.out.println(c.isDirectory());
		
//		정보분석
		System.out.println(a.getName());
		System.out.println(c.getName());
		System.out.println(c.getAbsolutePath());
		System.out.println(c.length());
		
//		디렉토리는 내용물 
		File[] list = c.listFiles();
		System.out.println(list.length);
		
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		
		for(File f : list) {
			System.out.println(f);
		}
	}

}
