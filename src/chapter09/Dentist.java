package chapter09;

public class Dentist extends Doctor{
	public Dentist(String name) {
		super(name,"치과");//과목을 부모에게 넘겨줌
		
	}
	
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.");
	}

	
}
