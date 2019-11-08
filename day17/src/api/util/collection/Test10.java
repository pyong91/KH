package api.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
//		List의 응용
//		1. 간단한 List 생성
		List<Integer> a = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			a.add(i);
		}
		System.out.println(a);
		
		List<Integer> b = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(b);
		System.out.println(b.getClass());
		
//		List를 가지고 할 수 있는 주요 작업
//		 - 정렬, 반전, 셔플
//		 - Collections 클래스를 이용하여 처리
		Collections.reverse(b);
		System.out.println(b);
		
		Collections.shuffle(b);
		System.out.println(b);
		
		Collections.sort(b);
		System.out.println(b);
	}

}
