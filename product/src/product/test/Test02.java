package product.test;

import product.beans.ProductDao;

//	Test02 사용자에게 등록된 모든 제품의 목록을 출력

public class Test02 {
	public static void main(String[] args) throws Exception {
		ProductDao dao = new ProductDao();
		dao.printList();
	}
}
