package chapter07;

public class Magazine {
	private String name;
	private int price; //접근 제한을 붙임
	
	void printProductInfo() {
		System.out.println(name+":"+price+"원");
	}
	//여기부터
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	//여기까진  접귽ㅔ한

	public Magazine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
}
