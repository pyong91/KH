package variable;

public class Test09 {

	public static void main(String[] args) {
//		문제 인바디 검사를 한다.
//		비만도를 측정하기 위해 키와 몸무게를 재었더니 180cm에 80kg이 나왔다.
//		비만도를 계산하여 출력하세요.
//		비만도 = 키(m) * 키(m) / 체중(kg)
		
		int h = 180;
		int w = 80;
		float r = (float)h/100;
		r *= r;
		System.out.println(w/r);
		
		
		
	}

}
