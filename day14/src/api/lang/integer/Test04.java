package api.lang.integer;

public class Test04 {

	public static void main(String[] args) {
//		결론 : 막 섞어 써도 된다(auto-boxing / auto-unboxing)
//		Wrapper class 한정
		
		Integer a = 10;
		Integer b = 20;
		Integer c = a + b;
		System.out.println(c);
	}

}
