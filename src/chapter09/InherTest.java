package chapter09;

public class InherTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student("�������� �Ӱ���","1234-5678","���� ����");
		Teacher t1 = new Teacher("ȫ��","1231-5432","�λ￬���а�");
		
		//p1.eat();
		//s1.eat();
		t1.eat();
		p1.sleep();
		t1.sleep();//Person�� ���� �״�� ��밡��

		s1.study();
		t1.teach();//�ڱ����� �ִ� �͵� ��밡��
	}

}
