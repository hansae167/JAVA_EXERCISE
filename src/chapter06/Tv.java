package chapter06;

public class Tv {
	String name;
	int price;
	String des;//description
	
	Tv(String name, int price){
		this.name = name;
		this.price =price;
	}
	
	Tv(String name, int price, String des){
		this(name,price);
		this.des = des;
	}
	
	void printTvInfo(){
		if(des!=null) {
		System.out.println(name + " : " + price);
		}else {
		System.out.println(name + " ("+des+") : " + price);
		}
	}
	
}
	

