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
		System.out.println("제품명 : " +name);
		System.out.println("정가 : " +name+"(할인율 : "+this.discoRate +"%)");
		System.out.println("판매가 : "+this.calculateDiscountPrice());
	}
	
	public int calculateDiscountPrice() {
		return price = price*discoRate/100;
	}
	
	
}
