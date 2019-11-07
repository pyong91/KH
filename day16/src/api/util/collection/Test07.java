package api.util.collection;

import java.util.HashMap;
import java.util.Map;

public class Test07 {

	public static void main(String[] args) {
//		Map - (K, V) 세트 저장소
//		 - 이름을 적어둔 책과 같다 (이름 =K, 책=V)
//		 - Key는 중복이 불가능
//		 - Value는 중복이 가능
//		 - 자유도가 매우 높음
		
		Map<String, Integer> map = new HashMap<>();
		
//		추가
		map.put("차은우", 22);
		map.put("공유", 40);
		map.put("정우성", 46);
		map.put("강동원", 38);
		map.put("원빈", 41);
		map.put("이정재", 46);
		map.put("원빈", 35);		// 키가 같으면 수정됨
		
//		확인 : key로 value를 꺼내는 것만 가능
		System.out.println(map.get("정우성"));
		System.out.println(map.get("장동건"));
		
//		검색 : contains
		System.out.println(map.containsKey("정우성"));
		System.out.println(map.containsValue(46));
		
//		삭제 : remove(k), remove(k, v)
		System.out.println(map.remove("원빈"));
		
		System.out.println(map);
		System.out.println(map.size());
		
	}

}
