package product.test;

import java.util.Scanner;

import product.beans.ProductDao;

public class Test03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제품종류를 입력하세요");
		String type = sc.next();
		ProductDao dao = new ProductDao();
		dao.printType(type);
	}
}
