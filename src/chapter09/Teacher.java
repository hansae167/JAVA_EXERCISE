package chapter09;

public class Teacher extends Person {
	private String sub;//subject
	
	public Teacher(String name, String phone, String sub) {
		super(name,phone);
		this.sub = sub;
	}
	@Override//�������̵� �� �޼������� �˸�, �׷��� �Ǽ��ؼ� ������ Ÿ�� �ٲ� �ٸ� �޼���� �ν��ϴ°� �ƴ϶� ������ ��� �ٲٰ� ���ش�.
	public void eat() {
		super.eat();
		System.out.println("�Բ����� �Դ�");
	}
	//�θ� Ŭ������ ������ ������ �ʿ��Ͽ� ���� �Ϻθ� �ٲ�(��������= �޼ҵ� �������̵�) �̷��� �ٽ� �Ἥ ������ �ٲ���´�.  ���⿡����.
	//�޼����  ������ Ÿ���̶��� �Ķ���͵��� �Ȱ��ƾ� �Ѵ�(�⺻ �������̵��� �ٸ�)
	//�׷��ٰ� ���� �ٲٴ°� �ƴϰ� �θ���� �ٽ� ���� �ִ�. ���������Ŷ� ����
	public void teach() {
		System.out.println("����ġ��.");
		
	}
}
