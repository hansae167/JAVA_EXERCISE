package chapter04;

public class ValueTest {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 60;
		int sum = 0;
		sum = num1 + num2;
		num1+=num2;//num1�� 110�� �� ������ sum�� ���� 60+50�̶� 110�̴�
		
		System.out.println(sum);
		System.out.println(num1);
//+�߿� ����    num1+=num2 >>> num1= num1+num2 �̴�(�� =���� �����ڰ� �̤����̵� ������.)
	}

}
