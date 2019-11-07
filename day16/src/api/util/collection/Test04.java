package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
//		로또 번호 6개를 추첨하여 중복없이 List에 저장
		Random r = new Random();
		int number;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			number = r.nextInt(45) + 1;
			if (list.contains(number)) {
				i--;
			} else {
				list.add(number);
			}
		}
		System.out.println(list);
	}

}
