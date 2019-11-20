package beans;

import java.util.List;

public class Test05 {
	public static void main(String[] args) throws Exception{
//		목표 : snack 테이블의 모든 데이터를 SnackDao를 이용해서 구해와 출력
		
		SnackDao dao = new SnackDao();
		
		List<SnackDto> list = dao.getList();
		
		System.out.println(list.size());
		
		for(SnackDto dto : list) {
//			System.out.println(dto);
			System.out.println(dto.getName());
		}
	}
}
