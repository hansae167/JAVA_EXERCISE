package chapter09;

public class Person {
	//public abstract class Person {//abstract ��ü�� ������� Ŭ����. ���ѽ����ش�.
	private String name;//privat... �� Ŭ���� �������� ���δ�~
	private String phone;
	
	public Person() {
		this.name = "����";
		this.phone = "����ó ����";
				
	}//??
	
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}//??
	
	//public abstract void watch();
	//	??-RE
	
	
	public void eat( ) {
		System.out.println("�Դ�");
	}
	
	public void sleep( ) {
		System.out.println("�ڴ�");
	}
	
}
