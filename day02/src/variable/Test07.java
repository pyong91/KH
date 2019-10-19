package variable;

public class Test07 {

	public static void main(String[] args) {
//		문제
//		삼각김밥이 1+1 행사중이다.
//		한개의 가격은 900원일 때
//		계산대에 7개의 삼각김밥을 들고가면 얼마를 계산해야하는 출력
//		(종업원은 귀찮아서 더 가져오라는 소리를 안한다.)
		
		int price = 900;
		int ea = 7;
		int free = ea / 2;
		int pay = ea - free;
		int total = pay * price;
		System.out.println(total);
		
	}

}
