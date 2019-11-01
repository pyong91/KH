package oop.modifier1;

public class Test_modifier {

	public static void main(String[] args) {
		Bank a = new Bank();
		
		a.setName("유재셕");
		a.setMoney(-10000);
		
		System.out.println(a.getName());
		System.out.println(a.getMoney());
	}

}
