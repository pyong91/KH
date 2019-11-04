package oop.poly1;

public class Test_poly1 {

	public static void main(String[] args) {
		GalaxyS10 a = new GalaxyS10();
		a.bixby();
		a.camera();
		
		GalaxyNote10 b = new GalaxyNote10();
		b.camera();
		b.memo();
		
//		 - 통합하여 사용하기 위한 구조
		Galaxy c = new GalaxyS10();  // 업캐스팅 : GalaxyS10 --> Galaxy
		c.camera();
		
		Galaxy d = new GalaxyNote10(); // 업캐스팅 : GalaxyNote10 --> Galaxy
		d.camera();
		
//		궁금점 : c가 무슨 형태인지 알고 싶다면?
		System.out.println(c instanceof GalaxyS10);		// true
		System.out.println(c instanceof GalaxyNote10);	// false
		System.out.println(c instanceof Galaxy);	// true
		
	}

}
