package chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 7;
		int addRes= num1 + num2;
		int subRes= num1 - num2;
		int mulRes= num1 * num2;
		int divRes= num1 / num2;
		int remRes= num1 % num2;
		System.out.println("�������:" + (num1+num2));//�̰� �ƴϸ� �Ѵٴ��� ������ ����
		System.out.println("�������:" + addRes);//�̷��÷ε� ����  �ƴϸ� �� ����� ������ ���� ���δ�(��� �޸� �� ���̴°Ŷ�)
		System.out.println("�E�����:" + subRes);
		System.out.println("�������:" + mulRes);
		System.out.println("���������:" + divRes);
		System.out.println("���������:" + remRes);		
		

	}

}
