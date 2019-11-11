package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) throws IOException {
		File file = new File("files", "single.txt");
		FileInputStream in = new FileInputStream(file);

//		byte 입력
//		준비물 : 대상(File), 통로(FileInputStream)
//		구조 : [프로세스]<-[in]<-[file]<-[single.txt]

//		in을 이용한 입력
//		for (long i = 0; i < file.length(); i++) {
//			int v = in.read();
//			System.out.println(v);
//		}

//		EOF(End Of File) 값인 -1이 나오면 종료
		while(true) {
			int v = in.read();
			if(v == -1) break;
			System.out.println(v);
		}

		in.close();
	}

}
