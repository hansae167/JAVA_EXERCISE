package chapter06;

public class Book {
	String title;
	String auther;
	int price;

	/*
	Book(){
		
	}
	//������
	*/
	
	Book(String auther){
		this.auther = auther;
	}
	
	Book(String newTitle, int newPrice){
		title = newTitle;
		price = newPrice;
	}//�굵 ������(�����ε�)
	
	
	/*
	  
	Book(String title, int price){
		this.title = title; //���� Ÿ��Ʋ�� ���⿡�� ���̰� this.title�� ���� �����ִ� title�� ����. 
		this.price = price;//
	}
	//�� ���� ���� �ִ�(���� �� �Ʒ�����)

	*/
	
	Book(String title, String auther){ 
		this.title = title;
		this.auther = auther;
	}
	
	Book(String title, String auther, int price){ 
		this(title,auther);//������ ȣ���ϴ� �� (String title, String auther)�̳��� 
		this.price = price;
	}
	
	
}
