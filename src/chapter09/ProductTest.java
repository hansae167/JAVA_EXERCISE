package chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("����ȣ",450000,8);
		Television tv1 = new Television("�ó׸�TV",3500000,10,"ȭ��ũ�� 151cm");
		System.out.println("==========��ǰ����==========");
		p1.printProductInfo();
		System.out.println("--------------------------");
		tv1.printProductInfo();
		System.out.println("��� :"+tv1.getDescr());
		       
		System.out.println("[����]�������� ��� 15%�� ������");
		p1.setDiscoRate(15);
		tv1.setDiscoRate(15);
		
		System.out.println(p1.getName() + "�ǸŰ� :"+p1.calculateDiscountPrice());
		System.out.println(tv1.getName() + "�ǸŰ� :"+tv1.calculateDiscountPrice());
	}

}//�����ִ� Ŭ�������� �޼��� �����ʿ�
