package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
//		Runtime 클래스
//		 - 싱글톤(생성제한)
//		 - 반드시 생성명령이 존재	getInstance() 또는 get클래스명()
//		Runtime r = new Runtime();
		Runtime r = Runtime.getRuntime();

		try {
//			.exec() 실행 명령
//			r.exec("calc");
//			r.exec("shutdon /f /s /t 0"); // PC 종료
//			r.exec("mspaint");
			r.exec("cmd /C start http://naver.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
