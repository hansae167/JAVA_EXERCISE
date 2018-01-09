package chapter06;

public class Product {
	String name;
	int price;
	int discount;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		this.discount =discount;
		System.out.println("=====" + name + "=====");
		System.out.println("정가 : " + price + "원");
		System.out.println("할인울 : 할인하지 않습니다.");
	}//원래 위에 sysout 쓰는 것 보다 메서드 하나를 만드는게 더 낫다, 위에건 그닥 좋은 방법이 아님(아래 참고)
	
	Product(String name, int price, int discount){
		this.name = name;
		this.price = price;
		this.discount =discount;
		System.out.println("=====" + name + "=====");
		System.out.println("정가 : " + price + "원");
		System.out.println("할인율 : " + discount + "%");
	}
	/*
	void printProuductInfo() {
		System.out.println("=====" + name + "=====");
		System.out.println("정가 : " + price + "원");
		if(discount >0) {
		System.out.println("할인율 : " + discount + "%");
		}else
		System.out.println("할인울 : 할인하지 않습니다.");
	}
	//위에 거 sysout들 다 지우고 아래 것을 쓰는 것이 더 낫다. ProductTest 에서는 printProuductInfo()하면 되고,
	*/
}
