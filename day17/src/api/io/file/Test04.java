package api.io.file;

import java.io.File;

public class Test04 {

	public static void main(String[] args) {
//		존재하지 않는 폴더의 생성 / 삭제
		File a = new File("test", "java");
		
		
		System.out.println(a.exists());
		
//		생성 : mkdir()
//			 mkdirs() -> 기준경로가 없으면 만들어줌
		boolean create = a.mkdirs();
		System.out.println(create);
		
//		삭제 : delete() : 비어있는 폴더만 삭제 가능
		boolean delete = a.delete();
		System.out.println(delete);
		
	}

}
