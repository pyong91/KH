package array;

public class Test13 {

	public static void main(String[] args) {
//		과자 이름 5개 저장
//		 - 치토스, 허니버터칩, 새우깡, 프링글스, 스윙칩

		String[] str = new String[] { "치토스", "허니버터칩", "새우깡", "프링글스", "스윙칩" };

		String temp;

		for (String s : str) {
			System.out.print(s + " ");
		}

		for (int i = 0; i < str.length / 2; i++) {
			temp = str[i];
			str[i] = str[str.length - i - 1];
			str[str.length - i - 1] = temp;
		}
		System.out.println();
		for (String s : str) {
			System.out.print(s + " ");
		}
	}

}
