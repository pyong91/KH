package product.test;

import java.util.Scanner;

import product.beans.ProductDao;

public class Test04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제품명을 입력하세요");
		String name = sc.next();
		ProductDao dao = new ProductDao();
		dao.searchName(name);
		
	}
}
