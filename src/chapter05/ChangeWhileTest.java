package chapter05;

public class ChangeWhileTest {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			int j=1;//������ j�� �ʱⰪ�� �����ϸ� �Ʒ������� j�� ��� Ŀ�������⶧���� ���� �Ѱ����� ���������, ���� while���� ���ư������� �ʱⰪ�� �����ϰ� �ؾ��Ѵ�.
			while(j<=i) {
				System.out.print("*");
				j++;
				
			}
		System.out.println();
			i++;
		}
	//����� for�� �ʱⰪ�� �ȿ� ���ϰ� ���־� �̷����� ����
	}

}
