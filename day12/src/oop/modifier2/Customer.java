package oop.modifier2;

public class Customer {
	private String name;
	private String model;
	private String telecom;
	private int agreement;
	private int principal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTelecom() {
		return telecom;
	}

	public void setTelecom(String telecom) {
		switch (telecom) {
		case "SK":
		case "KT":
		case "LG":
		case "알뜰폰":
			this.telecom = telecom;
		}
	}

	public int getAgreement() {
		return agreement;
	}

	public void setAgreement(int agreement) {
		switch (agreement) {
		case 0:
		case 24:
		case 30:
		case 36:
			this.agreement = agreement;
		}
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		if(principal >= 0)
		this.principal = principal;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(model);
		System.out.println(telecom);
		System.out.println(agreement);
		System.out.println(principal);
	}
}
