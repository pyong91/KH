package beans;

public class Test02 {
	public static void main(String[] args) throws Exception {
		
		Dao dao = new Dao();
		dao.insertAdmin("메가커피", "aprkzjvl", "aprkzjvl", 100, "2019-11-19");
		System.out.println("등록완료");
		
	}
}
