package oop.inherit4;

public class Galaxy {
	private String number;
	private int memory;

	public Galaxy(String number, int memory) {
		this.setNumber(number);
		this.setMemory(memory);
	}

	public void call() {
		System.out.println("전화를 걸고 있습니다");
	}

	public void sms() {
		System.out.println("문자메시지를 전송합니다");
	}

	public void photo() {
		System.out.println("사진 촬영을 시작합니다");
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		switch (memory) {
		case 128:
		case 256:
		case 512:
			this.memory = memory;
		}
	}
}
