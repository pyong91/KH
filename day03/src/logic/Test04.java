package logic;

public class Test04 {

	public static void main(String[] args) {
//		목표 : 어떤 사람의 나이가 주어졌을 때 이 사람이 "청소년"인지 파악
//		구간 : 14세 이상 19세 이하(20세 미만)
		
		int age = 15;
		
//		boolean a = age >= 14;
//		boolean b = age <= 19;
//		boolean b = age < 20;
		boolean c = age >= 14 && age < 20;
		
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
		
	}

}
