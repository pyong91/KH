package variable;

public class Test05 {

	public static void main(String[] args) {
//		 문제 : 어제 1시간 30분 공부하고 오늘 2시간 50분 공부했다.
//			  내가 공부한 시간을 계산하여 화면에 출력.
		int hour;
		int minute;
		int yesterday;
		int today;
		int total;
		
		hour = 1;
		minute = 30;
		yesterday = hour * 60 + minute;
		
		hour = 2;
		minute = 50;
		today = hour * 60 + minute;
		
		total = yesterday + today;
		
		System.out.println(total / 60);
		System.out.println(total % 60);
		
	}

}
