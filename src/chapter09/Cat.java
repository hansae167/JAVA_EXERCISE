package chapter09;

public class Cat extends Animal {
	private String name;
	
	public Cat(int age, String kind, String name ) {
		super(age,kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("¸ğºô³îÀÌ°¡ Á¶¤¾¾Æ¿ä ");
		
	}
	
	public void hunt() {
		System.out.println("Áã¸¦ Àâ´Â´Ù");
	}

}
