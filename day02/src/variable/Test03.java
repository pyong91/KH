package variable;
import java.lang.*;

public class Test03 {
	public static void main(String[] args) {
		
		//문제 : 10분당 500원인 주차장이 있습니다.
		//		2시간 30분 주차요금을 계산하세요.
		
		int hour = 2;
		int minute = 30;
		int charge = 500;
		int per = 10;
		
		int time = hour * 60 + minute;
		
		System.out.println(time / per * charge);
		
	}
}
