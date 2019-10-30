package array;

public class Test19 {
	
	public static void main(String[] args) {
//		버블 정렬을 이용하여 3, 5, 2, 1, 4를 정렬하여 출력하세요
		int[] ary = new int[] {3, 5, 2, 1, 6, 4};
		int len = ary.length;
		int temp;

		for (int i = 0; i < len-1; i++) {
			for (int j = len-1; j > i; j--) {
				if(ary[j]<ary[j-1]) {
					temp = ary[j];
					ary[j] = ary[j-1];
					ary[j-1] = temp;
				} 
			}
		}
		for(int n : ary)
		System.out.println(n);
	}

}