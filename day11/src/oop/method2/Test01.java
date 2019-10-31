package oop.method2;

public class Test01 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.set("마리오", 80, 85, 82, 247, 82.3);
		s2.set("루이지", 55, 90, 85, 230, 76.6);
		s3.set("쿠파", 77, 65, 23, 165, 55);
		
		s1.print();
		s2.print();
		s3.print();
	}

}
