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
		System.out.println("���� : " + price + "��");
		System.out.println("���ο� : �������� �ʽ��ϴ�.");
	}//���� ���� sysout ���� �� ���� �޼��� �ϳ��� ����°� �� ����, ������ �״� ���� ����� �ƴ�(�Ʒ� ����)
	
	Product(String name, int price, int discount){
		this.name = name;
		this.price = price;
		this.discount =discount;
		System.out.println("=====" + name + "=====");
		System.out.println("���� : " + price + "��");
		System.out.println("������ : " + discount + "%");
	}
	/*
	void printProuductInfo() {
		System.out.println("=====" + name + "=====");
		System.out.println("���� : " + price + "��");
		if(discount >0) {
		System.out.println("������ : " + discount + "%");
		}else
		System.out.println("���ο� : �������� �ʽ��ϴ�.");
	}
	//���� �� sysout�� �� ����� �Ʒ� ���� ���� ���� �� ����. ProductTest ������ printProuductInfo()�ϸ� �ǰ�,
	*/
}
