package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test04 {
	public static void main(String[] args) throws IOException {
//		FileWriter + BufferedWriter + PrintWriter
		
		File target = new File("files", "string2.txt");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("가나다라마바사");
		pw.println("hello");
		pw.println("자바 너무 좋아");
		
//		fw.flush();	 중간중간에 flush()씀
		pw.close();	// 보통 마지막에 close()씀
	}
}
