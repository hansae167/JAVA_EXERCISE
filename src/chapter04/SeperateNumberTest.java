package chapter04;

public class SeperateNumberTest {
//�� �ڸ� ����ϱ�
	public static void main(String[] args) {
		//�߿�
		int num = 456;
		int num100 = num/100;//4.56������ �� ����ϹǷ� 4�� ���� (���� int �̴�)
		int num10 = (num/10)%10;//45���ٰ� %10�� �ؼ� ������ 5�� ����
		int num1 = (num%10);//45.6����  ������ 6�� ����
		int num1_2 = (num%100)%10;//��ǻ� �������� �̰� ������ 456>56>6
		//�����غ�
		System.out.println(num);
		System.out.println(num100);
		System.out.println(num10);
		System.out.println(num1);
		System.out.println(num1_2);
	}

}
