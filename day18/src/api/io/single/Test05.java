package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) throws IOException {
//		many.txt에 작성된 파일을 버퍼 크기 4로 입력받기
//		준비물 : 파일, 스트림, 버퍼
		
		File target = new File("files", "many.txt");
		FileInputStream in = new FileInputStream(target);
		
		byte[] buffer = new byte[1024];
		int n;
//		n = in.read(buffer);
//		System.out.println(n);
//		System.out.println(Arrays.toString(buffer));
//		n = in.read(buffer);
//		System.out.println(n);
//		System.out.println(Arrays.toString(buffer));
//		n = in.read(buffer);
//		System.out.println(n);
//		System.out.println(Arrays.toString(buffer));
		
//		시간측정코드추가 : System.currentTimeMillis();
		long start = System.currentTimeMillis();
		
		while(true) {
//			n = in.read(buffer, 0, v); // buffer에 들어있는 값을 내보내세요 (0부터 v개)
			n = in.read(buffer);
			if(n==-1) break; // EOF
			System.out.println(n);
			System.out.println(Arrays.toString(buffer));
		}
		
		long finish = System.currentTimeMillis();
		
		System.out.println("start : " + start);
		System.out.println("finish : " + finish);
		System.out.println("시간차 : " + (finish - start));
		
		in.close();
	}
}
