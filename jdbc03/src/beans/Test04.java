package beans;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		SnackDao sd = new SnackDao();
		
		System.out.println("상품명을 입력하세요");
		String name = sc.next();
		System.out.println("가격을 입력하세요");
		int price = sc.nextInt();
		System.out.println("재고수량을 입력하세요");
		int stock = sc.nextInt();
		
		sd.insert(name, price, stock);
		System.out.println("처리완료");
	}
}
