package array;

public class Test17 {

	public static void main(String[] args) {
//		3, 5, 2, 1, 4 를 배열에 저장하고 "가장 작은 값의 위치"를 구하여 출력
		
		int[] ary = new int[] {3, 5, 2, 1, 4};
		int minIndex = 0;
		int min = ary[0];
		
		for (int i = 0; i < ary.length; i++) {
			if(min>ary[i]) {
				min = ary[i];
				minIndex = i;
			}
		}
		System.out.println(minIndex);
	}

}
