package chapter09;

public class Person {
	//public abstract class Person {//abstract 객체를 못만드는 클래스. 제한시켜준다.
	private String name;//privat... 이 클래스 내에서만 쓰인다~
	private String phone;
	
	public Person() {
		this.name = "무명";
		this.phone = "연락처 없음";
				
	}//??
	
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}//??
	
	//public abstract void watch();
	//	??-RE
	
	
	public void eat( ) {
		System.out.println("먹다");
	}
	
	public void sleep( ) {
		System.out.println("자다");
	}
	
}
