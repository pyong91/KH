package oop.multi1;

public class Test_multi1 {

	public static void main(String[] args) {
//		Teacher의 인스턴스 생성
//		Teacher t = new Teacher();	인터페이스라 불가능

//		Person의 인스턴스 생성
		Person p = new Person();
		p.teach();
		p.speak();
	
//		다형성 가능
		Teacher t1 = p;
		Teacher t2 = new Person();	// 업캐스팅
		t1.speak();
		t2.teach();
		
		
	}

}
