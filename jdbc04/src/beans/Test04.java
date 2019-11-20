package beans;

public class Test04 {
	public static void main(String[] args) throws Exception {
//		SnackDto에 데이터를 넣은 상태로 insert를 수행
		SnackDto dto = new SnackDto();
		dto.setName("a");
		dto.setPrice(10);
		dto.setStock(5);
		
		SnackDao dao = new SnackDao();
		dao.insert(dto);
		System.out.println("완료");
	}
}
