package chapter04;

public class TemperatureTest {

	public static void main(String[] args) {
		int farn = 100; //farnheit
		double celc = 5.0/9.0 * (farn-32); //celcius //5/9�� 0 �̴�. �Ǽ������� ����
		double cel = (double)5/9 * (farn-32); //�̷��� �Ǽ������� �ص� �ȴ�
		double yee = 5;//���� ����� �ƴ�
		double pee = 9;
		System.out.println("ȭ��:" + farn);
		System.out.println("����:" + celc);
		System.out.println(yee/pee);
		System.out.println(cel);
	}

}
