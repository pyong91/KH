package oop.modifier3;

public class Apartment {
	private int pyung;
	private int room;
	private int bathroom;
	private boolean veranda;
	private int price;

	public int getPyung() {
		return pyung;
	}

	public void setPyung(int pyung) {
		switch (pyung) {
		case 25:
		case 28:
		case 31:
		case 34:
			this.pyung = pyung;
		}
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		if (room < 1)
			this.room = 1;
		else
			this.room = room;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		if (bathroom < 1)
			this.bathroom = 1;
		else
			this.bathroom = bathroom;
	}

	public boolean isVeranda() {
		return veranda;
	}

	public void setVeranda(boolean veranda) {
		this.veranda = veranda;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0)
			return;
		this.price = price / 1000000 * 1000000;
	}

	public void print() {
		System.out.println("평형 : " + this.getPyung());
		System.out.println("방 개수 :" + this.getRoom());
		System.out.println("화장실 개수 :" + this.getBathroom());
		if (veranda)
			System.out.println("베란다 : 확장형");
		else
			System.out.println("베란다 : 미확장");
		System.out.println("가격 : " + this.getPrice());
	}
}
