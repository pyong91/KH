package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test12 {

	public static void main(String[] args) {
//		Student 배열 2000칸
		Student[] a = new Student[2000];
		System.out.println(a.length);
		
//		a[0]에 인스턴스를 대입
		a[0] = new Student();
		a[1] = new Student();
		a[0].name = "유재석";
		a[0].score = 90;
		
		System.out.println(a[0].name);
		System.out.println(a[0].score);
		
//		Student를 저장할 List 생성(매우 많이 씀****************************************)
		List<Student> b = new ArrayList<>();
		b.add(new Student());
		b.add(new Student());
		System.out.println(b);
		
		b.get(0).name = "강동원";
		b.get(0).score = 100;
		b.get(1).name = "원빈";
		b.get(1).score = 99;
		System.out.println(b.get(0).name);
		System.out.println(b.get(0).score);
		System.out.println(b.get(1).name);
		System.out.println(b.get(1).score);
		
		for(Student st : b) {
			System.out.println(st.name);
			System.out.println(st.score);
		}
	}

}
