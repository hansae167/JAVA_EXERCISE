package chapter10;

public class Student extends Person {//부모(Person) 으로 상속받는다(이 클래스는.)
	private String depart;//department
	
	public Student(String name, String phone, String depart) { 
		super(name, phone);//super()와 this()은 동시에 쓸수 없다
		this.depart =depart;
	}//??
	
	public void study() {
		System.out.println("공부를 한다.");
	}
	
	public void eat( ) {
		System.out.println("조별로 먹다");
	}
}
