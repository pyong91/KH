package api.util.collection;

import java.util.Set;
import java.util.TreeSet;

public class Test05 {

	public static void main(String[] args) {
		Set<String> a = new TreeSet<>();
		a.add("차은우");
		a.add("공유");
		a.add("정우성");
		a.add("강동원");
		System.out.println(a.add("원빈"));
		System.out.println(a.add("원빈"));		
		System.out.println(a.size());
		System.out.println(a.contains("공유"));
		System.out.println(a.remove("공유"));
		System.out.println(a.remove("한가인"));
		System.out.println(a);
		
//		전체 추출이 되는가?
//		 - 일반적인 반복문으로는 불가능
//		 - 확장 반복문으로 사용
		for(String name : a) {
			System.out.println(name);
		}
	}

}
