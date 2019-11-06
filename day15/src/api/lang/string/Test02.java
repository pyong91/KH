package api.lang.string;

public class Test02 {
	public static void main(String[] args) {
		String a = "Hello";
		
		byte[] by = new byte[] {104,101,108,108,111};
		String b = new String(by);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		if(a.length() == b.length()) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
