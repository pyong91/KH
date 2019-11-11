package api.io.string;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
//		FileWriter를 이용한 문자열 출력
		
		File target = new File("files", "string2.txt");
		FileWriter fw = new FileWriter(target);
		
		fw.write("가나다라마바사");
		fw.write("hello");
		fw.write("자바 너무 좋아");
		
//		fw.flush();	 중간중간에 flush()씀
		fw.close();	// 보통 마지막에 close()씀
	}
}
