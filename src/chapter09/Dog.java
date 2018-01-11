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
		System.out.println("루돌프를 잡아요.");
	}
	
	@Override
	public void run() {
		System.out.println("마하40 으로 뛰어!");
	}

}
