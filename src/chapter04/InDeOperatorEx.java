package chapter04;

public class InDeOperatorEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(++num1);//num1 ���� 1�� ���� ���� ���� ���(����)
		System.out.println(num2++);//num2 �� �����(����) 1�� ����
		
		int res = --num1 + num2--; //������ ����
				
		System.out.println(res);
	}

}
