package product.test;

import java.util.Scanner;

import product.beans.ProductDao;

//	사용자에게 정보를 입력받아 제품을 등록하는 코드를 구현

public class Test01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 이름을 입력하세요");
		String name = sc.next();
		System.out.println("상품 타입을 입력하세요(과자, 음료, 빵)");
		String type = sc.next();
		System.out.println("가격을 입력하세요");
		int price = sc.nextInt();
		
		ProductDao dao = new ProductDao();
		dao.insertProduct(name, type, price);
	}
}
