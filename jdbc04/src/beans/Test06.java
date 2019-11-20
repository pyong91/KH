package beans;

import java.util.List;
import java.util.Scanner;

//	사용자에게 이름 검색어를 입력받아 해당하는 이름을 포함하는 목록을 구하여 출력
public class Test06 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SnackDao dao = new SnackDao();
		
		System.out.println("과자 이름을 입력하세요");
		String name = sc.next();		
		List<SnackDto> list = dao.search(name);
		
		System.out.println("번호\t이름\t가격\t재고");
		for(SnackDto dto : list) {
			System.out.print(dto.getNo()+"\t");
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getPrice()+"\t");
			System.out.println(dto.getStock());
		}
	}
}
