package api.util.collection;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
	public static void main(String[] args) {
//		로또 번호 6개를 추첨하여 중복없이 Set에 저장
		Random r = new Random();
		int number;
		Set<Integer> lotto = new TreeSet<>();
		while (lotto.size() < 6) {
			lotto.add(r.nextInt(45) + 1);
		}
		System.out.println(lotto);
	}
}
