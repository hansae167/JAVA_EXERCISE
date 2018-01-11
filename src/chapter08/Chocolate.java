package chapter08;

public class Chocolate {
	private String name;
	private String type;
	private int price;
	
	Chocolate(String a, String b, int c){
		this.name = a;
		this.type = b;
		this.price = c;
	}
	
	String getName() {
		return name;
	}
	
	
	public String getType() {
		return type;
	}


	public int getPrice() {
		return price;
	}


	int calculateTotalPrice(int count){
		return count*price;
		}
	
	int calculateTotalPrice(int count, int discount){
		return count * price * (100 - discount) / 100;
		}//서로 다른메소드로 인식함
	
	void changeChocolateInfo(String newName,int newPrice){
		name = newName;
		price = newPrice;
		printChocolateInfo();//메서드내에서 다른 메서드 호출가능 
		
	}
	
	void changeChocolateInfo(String newName, String newType, int newPrice){
		name = newName;
		price = newPrice;
		type = newType;
		printChocolateInfo(); 
		
	}
	
	void printChocolateInfo() {
		System.out.println("이름 :"+name+",종류 :"+type+",가격 :"+price);
	}
}
