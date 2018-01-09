package chapter06;

public class Book {
	String title;
	String auther;
	int price;

	/*
	Book(){
		
	}
	//생성자
	*/
	
	Book(String auther){
		this.auther = auther;
	}
	
	Book(String newTitle, int newPrice){
		title = newTitle;
		price = newPrice;
	}//얘도 생성자(오버로딩)
	
	
	/*
	  
	Book(String title, int price){
		this.title = title; //여기 타이틀은 여기에만 쓰이고 this.title은 저기 위에있는 title을 말함. 
		this.price = price;//
	}
	//와 같이 쓸수 있다(위에 걸 아래같이)

	*/
	
	Book(String title, String auther){ 
		this.title = title;
		this.auther = auther;
	}
	
	Book(String title, String auther, int price){ 
		this(title,auther);//생성자 호출하는 거 (String title, String auther)이놈을 
		this.price = price;
	}
	
	
}
