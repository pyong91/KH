package product.test;

import java.util.Scanner;

import product.beans.ProductDao;

public class Test06 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제품번호를 입력하세요");
		int serial = sc.nextInt();
		System.out.println("변경할 가격을 입력하세요");
		int price = sc.nextInt();
		ProductDao dao = new ProductDao();
		dao.updatePrice(serial, price);
		
	}
}
