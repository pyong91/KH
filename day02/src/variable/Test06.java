package variable;

public class Test06 {

	public static void main(String[] args) {
//		* 문제 
//		PC방 요금이 한시간에 600원입니다.
//		PC방에 오후 2시 50분에 들어가서 오후 11시 15분에 나왔습니다.
//		계산해야할 요금은 ? // 10원단위는 올림
		
		int hour, minute, end, start, time;
		int price = 600;
		int pricePerMin = price/6;
		int total;
		
		hour = 2; 
		minute = 50;
		start = hour * 60 + minute;
		
		hour = 11; 
		minute = 15;
		end = hour * 60 + minute;
		
		time = end - start + 9;
		total = time / 10 * pricePerMin;
		
		System.out.println(total);
	}

}
