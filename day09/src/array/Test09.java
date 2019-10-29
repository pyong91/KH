package array;

public class Test09 {

	public static void main(String[] args) {
		
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b = new int[] { 1, 2, 3, 4, 5 };
		int[] c = a;
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a[1] = 7;
		System.out.println(a[1]);
	}

}
