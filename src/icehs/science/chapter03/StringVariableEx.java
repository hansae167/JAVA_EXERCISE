package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name ="ȫ����";
		String mathSc = "95";//���ڿ�,�μ��� �����̴�
		int intMathSc = Integer.parseInt(mathSc); //���ڿ���mathSc�� int������ ��ȯ, �������� �����ϴ�.
		int engSc = 82;//��� ��갡��
		
		System.out.println("�̸�:"+name);
		System.out.println("��������:"+mathSc);
		System.out.println("��������:"+engSc);
		//�ǵ��� ���� ���°� ����
		System.out.println("�հ�����:"+ intMathSc+engSc);//+���ڿ�+����, ����� �ȵȴ�
		//��� ���� �׳��̾����� ���´�
		//����� int�� �ٲ㵵 �ȵȴ�
		System.out.println("�հ�����:"+ (intMathSc+engSc));
		//�̷��� ��ȣ�� �������
		System.out.println("�հ�����:" + (intMathSc+engSc) + "��");
		//�̷��Ե� ���� (�� ��ȣ���� �Ѵ� ����, ������ ���ڿ��̸� �� ���ڿ��� �ν��ϴ� �� ��ȣ ����(����) ����Ѵ� ��������
		
	}

}
