package array;

import java.util.Arrays;

public class Test20 {

	public static void main(String[] args) {
//		삽입 정렬을 이용하여 3, 5, 2, 1, 4를 정렬하여 출력하세요
//		삽입 정렬 : 위치별로 존재하는 값들의 목적지를 찾아 삽입하는 형태의 정렬

		int[] data = new int[] { 3, 5, 2, 1, 4 };

		for(int position = 0; position < data.length; position++) {
			int copy = data[position];
			int i;
			for (i = position; i > 0; i--) {
				if (copy > data[i - 1]) {
					break;
				} else {
					data[i] = data[i - 1];
				}
			}
			data[i] = copy;
		}

		System.out.println(Arrays.toString(data));
		
	}

}