package chapter10;

public class Student extends Person {//�θ�(Person) ���� ��ӹ޴´�(�� Ŭ������.)
	private String depart;//department
	
	public Student(String name, String phone, String depart) { 
		super(name, phone);//super()�� this()�� ���ÿ� ���� ����
		this.depart =depart;
	}//??
	
	public void study() {
		System.out.println("���θ� �Ѵ�.");
	}
	
	public void eat( ) {
		System.out.println("������ �Դ�");
	}
}
