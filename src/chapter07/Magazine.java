package chapter07;

public class Magazine {
	private String name;
	private int price; //���� ������ ����
	
	void printProductInfo() {
		System.out.println(name+":"+price+"��");
	}
	//�������
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
	//�������  ���C����

	public Magazine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
}
