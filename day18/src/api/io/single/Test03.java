package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\user1\\Desktop\\설치파일", "jdk-8u191-windows-x64.exe");
		File copy = new File("D:/", "copy.exe");

		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream(copy);
		
//		구조 : single.txt > readFile > in > 프로세스 > out > writeFile > copy.txt
		
		while (true) {
			int v = in.read();
			System.out.println("읽은 값 : " + v);
			if(v == -1) break;
			out.write(v);
			System.out.println("저장한 값 : " + v);
		}
		
		in.close();
		out.close();
		
	}
}
