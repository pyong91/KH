package api.lang.object;

public class Test02 {
	public static void main(String[] args) {
		Person p = new Person();
		
//		p는 어떠한 기능도 이용할 수 없어야 한다
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		
	}
}
