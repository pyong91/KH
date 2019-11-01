package oop.modifier1;

import java.util.Set;

public class Bank {
	private String name;
	private int money;
	
	public void setMoney(int money) {
		if(money >= 0) this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
