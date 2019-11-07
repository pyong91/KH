package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
//		리스트 명령 다루기
		List<String> list = new ArrayList<>();
		
//		추가
//		list.add(100);
		list.add("차은우");
		list.add("공유");
		list.add(1, "정우성");	// 추가
		list.add("강동원");
		
//		수정
		list.set(1, "원빈");
		
//		확인
		System.out.println(list.get(1));
		
//		개수
		System.out.println(list.size());
		
//		삭제
		list.remove(2);
		
//		확인
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
