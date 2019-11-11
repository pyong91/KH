package api.io.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Test06 {

	public static void main(String[] args) throws IOException {
		File resultFile = new File("files", "result.txt");
		File sampleFile = new File("files", "sample.csv");

		FileReader fr = new FileReader(sampleFile);
		BufferedReader br = new BufferedReader(fr);
		FileWriter wf = new FileWriter(resultFile);
		BufferedWriter bw = new BufferedWriter(wf);
		PrintWriter pw = new PrintWriter(bw);

		int[] count = new int[56];
		br.readLine();
		br.readLine();
		while (true) {
			String str = br.readLine();
			if(str == null) break;
			String[] strAry = str.split(",");
			pw.println(strAry[2]);
			int year = Integer.parseInt(strAry[2]);
			count[year - 1964]++;
		}
		pw.close();
		br.close();
		
		for (int i = 0; i < count.length; i++) {
			System.out.println((1964+i) + "년도 : " + count[i] + "개");
		}
	}

}
