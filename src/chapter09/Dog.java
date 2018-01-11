package chapter09;

public class Dog extends Animal {
	private String name;
	
	public Dog(int age, String kind, String name ) {
		super(age,kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void hunt() { 
		System.out.println("�絹���� ��ƿ�.");
	}
	
	@Override
	public void run() {
		System.out.println("����40 ���� �پ�!");
	}

}
