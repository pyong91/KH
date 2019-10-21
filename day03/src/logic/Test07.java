package logic;

public class Test07 {

	public static void main(String[] args) {
		// or 연산	||
		
//		목표 : 어떤 사람의 나이가 "청소년"에 해당되지 않는지 확인
//		나이가 14세 미만이거나 20세 이상인 경우
		
		int age = 15;
		
		boolean result = age < 14 || age > 19;
//		result = !(age >= 14 && age <20);		
		
		System.out.println(!result);
		
	}

}
