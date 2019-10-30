package array;

public class Test16 {

	public static void main(String[] args) {
//		최대값 찾기
//		[1] 맨 앞자리가 가장 크다고 가정
//		[2] 뒤의 값들을 지속적으로 비교하여 더 큰 값이 나오면 교체 (for)

		int[] data = new int[] { 3, 5, 2, 1, 4 };
		int max = data[0];

		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}

		System.out.println(max);
	}

}
