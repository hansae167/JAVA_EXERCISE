package chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(sum < 100) {
			sum += i*5;
			System.out.println("+("+(i*5)+")"+sum);
			i++;
		}
	}
//sum�� ���� 100�����϶� ����϶�..
//sum�� ���� ���߿� 103���� �Ѿ���� �� �׋� �ߴ��� ������ �ٲ㼭 �����Ҽ� �ִ�
}
