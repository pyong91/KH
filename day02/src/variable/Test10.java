package variable;

public class Test10 {

//	문제
//	휘발유 1L당 8.5km를 달릴 수 있는 자동차가 있다.
//	휘발유는 1L에 1500원이다.
//	이번 여행의 거리를 계산해보니 운전을 350km 해야한다.
//	필요한 기름은 몇 L이고, 주유비는 얼마?
	
	
	public static void main(String[] args) {

		double km = 8.5;
		int charge = 1500;
		double total = 350 / km;
		
		System.out.println((int)(total * charge));
	}

}
