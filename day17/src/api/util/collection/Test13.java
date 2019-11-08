package api.util.collection;

import java.util.ArrayList;
import java.util.List;

//장난감 가게에서 장난감 정보를 하나의 저장소에 모아서 등록하려고 합니다.
//
//장난감 정보는 `이름`과 `가격`으로 구성되어 있습니다.
//
//다음 장난감들을 저장한 뒤 모든 정보를 출력하세요
//
//[1] 이름 : 뽀로로 , 가격 : 20000원
//[2] 이름 : 탑블레이드 , 가격 : 35000원
//[3] 이름 : 또봇 , 가격 : 15000원
//[4] 이름 : 타요 , 가격 : 18500원
//[5] 이름 : 터닝메카드 , 가격 : 25000원
public class Test13 {

	public static void main(String[] args) {
		List<Toy> list = new ArrayList<>();

		list.add(new Toy("뽀로로", 20000));
		list.add(new Toy("탑블레이드", 35000));
		list.add(new Toy("또봇", 15000));
		list.add(new Toy("타요", 18500));
		list.add(new Toy("터닝메카드", 25000));

		for (Toy t : list) {
			System.out.println("이름 : " + t.getName());
			System.out.println("가격 : " + t.getPrice() + "원");
		}

	}

}
