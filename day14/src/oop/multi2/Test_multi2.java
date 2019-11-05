package oop.multi2;

public class Test_multi2 {

	public static void main(String[] args) {
		SK skS10 = new GalaxyS10();
		skS10.tmap();		
		((GalaxyS10)skS10).bixby();
		((GalaxyS10)skS10).call();
		((GalaxyS10)skS10).samsungpay();
		
		KT ktS10 = new GalaxyS10();
		ktS10.ollehStore();
		((GalaxyS10)ktS10).bixby();
		((GalaxyS10)ktS10).call();
		((GalaxyS10)ktS10).samsungpay();
	}

}
