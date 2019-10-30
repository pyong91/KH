package array;

public class Test18 {

	public static void main(String[] args) {
//		3, 5, 2, 1, 4 를 배열에 저장하고
//		 - "가장 작은 값을 맨 앞에 위치" 하도록 구현
//		 - "두 번째 작은 값은 두 번째에 위치" 하도록 구현
//		 - 위와 같이 진행하여 전체가 정렬되도록 구현하는 것이 목표(1, 2, 3, 4, 5)
//		위와 같은 정렬 방식을 선택 정렬(selection sort)라고 합니다.
		
		int[] ary = new int[] {3, 5, 2, 1, 4};             
		int index = 0;
		int temp;
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = i; j < ary.length; j++) {
				if(ary[index] > ary[j]) {
					index = j;
				}				
			}
			temp = ary[i];
			ary[i] = ary[index];
			ary[index] = temp;
		}
		
		for(int a : ary) {
			System.out.println(a);
		}
	}

}
