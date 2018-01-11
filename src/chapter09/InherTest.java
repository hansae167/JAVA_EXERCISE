package chapter09;

public class InherTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student("걱정대장 임걱정","1234-5678","걱정 상담과");
		Teacher t1 = new Teacher("홍삼","1231-5432","인삼연구학과");
		
		//p1.eat();
		//s1.eat();
		t1.eat();
		p1.sleep();
		t1.sleep();//Person의 것을 그대로 사용가능

		s1.study();
		t1.teach();//자기한테 있는 것도 사용가능
	}

}
