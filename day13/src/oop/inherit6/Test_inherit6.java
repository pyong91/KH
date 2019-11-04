package oop.inherit6;

public class Test_inherit6 {

	public static void main(String[] args) {
		GalaxyS10 s10 = new GalaxyS10("010-0001-0001");
		s10.call();
		s10.sms();
		s10.bixby();
		
		GalaxyNote10 note10 = new GalaxyNote10("010-0001-0002");
		note10.call();
		note10.sms();
		note10.memo();
		
		IPhone10 ip10 = new IPhone10("010-0002-0001");
		ip10.call();
		ip10.airdrop();
		ip10.itunes();
		
		IPhone11 ip11 = new IPhone11("010-0002-0002");
		ip11.call();
		ip11.airdrop();
		ip11.siri();
		
		System.out.println();
	}

}
