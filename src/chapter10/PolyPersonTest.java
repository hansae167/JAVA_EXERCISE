package chapter10;

public class PolyPersonTest {

	public static void main(String[] args) {
		/*
		Person p1 = new Person();
		
		Student s1 = new Student("ȫ���ΰ�","123","�����а�");
		Teacher t1 = new Teacher("��ġ����ġ","12345","�丮�а�");
		//�̷��Ե� ������
		
		Person s1 = new Student("ȫ���ΰ�","123","�����а�");
		Person t1 = new Teacher("��ġ����ġ","12345","�丮�а�");
		//�̷��� �ص� �ȴ�
		//�׷��� �ϸ�*
		 * 
		*/
		
		Person[] p1 = {new Person(), new Student("ȫ���ΰ�","123","�����а�"), new Teacher("��ġ����ġ","12345","�丮�а�")};
		//*�̷��� �迭�� ���� �� �ִٴ� ������ �ִ�.
		
		/*
				p1.sleep();
				s1.sleep();
				t1.sleep();
				//���⵵ �̷��� ��������*
		 */
		//*�Ʒ����� �ٲ�� �Ѵ�
		//���⼭	p1[1].study(); �� Person�� ��ü�̱� ������ �̰��� ����Ҽ� ����
		//((Student)student).study(); ���� �÷� ĳ������ �ؼ� �� ������ �ذ� �Ҽ� �ִ�
		p1[0].sleep();
		p1[1].sleep();
		p1[2].sleep();
		((Student)p1[1]).study();//�̰� ����
		//((Teacher)p1[1]).teach();//�̰� �����ϸ� ������ ��� p1[1]�� student�ε�
		
		
		p1[0].eat();
		p1[1].eat();
		p1[2].eat();//�� �� �������̵� ��
		
		//�θ��� ���� ȣ���ϴ°� �ƴ϶� (�ҰŸ� super.eat();�� ����)
		//���� �ڽ��� ���� ȣ��Ǵ°��̴� (��ӵȰ� �̿��Ѱ�����)
		
		if(p1[1] instanceof Student) {//p1[1]�� ���� Student�� �ν��Ͻ����(��ü),
			Student s = (Student)p1[1]; //�̰ɷ� �ٲ��
			s.study();
		}else if(p1[1] instanceof Teacher) {
				Teacher t =(Teacher)p1[1];
				t.teach();
		}//�̰� �����ϸ� for������ �� ���� ��Ÿ�� �� �ִ�.
		
	
	}

}
