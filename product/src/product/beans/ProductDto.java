package product.beans;

public class ProductDto {

	private int serial;
	private String name;
	private String type;
	private int price;
	private int acc;
	private String reg;

	public ProductDto() {
		super();
	}

	public ProductDto(int serial, String name, String type, int price, int acc, String reg) {
		super();
		this.serial = serial;
		this.name = name;
		this.type = type;
		this.price = price;
		this.acc = acc;
		this.reg = reg;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

}
