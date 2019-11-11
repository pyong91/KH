package api.io.string;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException{
//		byte 방식으로 문자열을 저장
		String text = "파일 입출력 어려워요... 진짜에요";
		
//		files/string.txt와 연결할 준비
		File target = new File("files", "string.txt");
		FileOutputStream out = new FileOutputStream(target);
		
		byte[] data = text.getBytes();
		out.write(data);
		
		out.close();
	}
}
