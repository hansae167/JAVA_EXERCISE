package chapter09;

public class Product {
	private String name;
	private int price; 
	private int discoRate;//discount rate
	
	public Product(String name, int price, int discoRate) {
		this.name = name;
		this.price = price;
		this.discoRate = discoRate;
	}
	
	public int getDiscoRate() {
		return discoRate;
	}
	public void setDiscoRate(int discoRate) {
		this.discoRate = discoRate;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void printProductInfo() {
		System.out.println("��ǰ�� : " +name);
		System.out.println("���� : " +name+"(������ : "+this.discoRate +"%)");
		System.out.println("�ǸŰ� : "+this.calculateDiscountPrice());
	}
	
	public int calculateDiscountPrice() {
		return price = price*discoRate/100;
	}
	
	
}
