package chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car cars[] = {new Car(), new Taxi(), new Truck()};
		cars[0].wash();
		cars[1].wash();
		cars[2].wash();
		

		//�������̽� �׽�Ʈ ������ ����
		
		/*cars[0].go(30);
		cars[0].go(20);*/
		
		//cars[0].setOilSize(10);
		//cars[0].go(20);
		//((Taxi)cars[0]).setMaxNum(4);
		//**ĳ���� �� �޼��� ȣ���ϱ� ���ؼ� (������ �� Car�� ��ü�� ������)
		//System.out.println("�ý� ����  : "+((Taxi)cars[0]).getMaxNum()+"��");
		
		//cars[1].setOilSize(10);
		//cars[1].go(30);
		//((Truck)cars[1]).setMaxWei(100);
		//System.out.println("Ʈ�� ����  :  "+((Truck)cars[1]).getMaxWei()+"kg");
		
		
		
		/*
		for(int i=0; i<cars.length; i++) {
			cars[i].setOilSize(10);
		}
		
		for(int i = 0; i < cars.length; i++) {
			cars[i].go(20);
		}
		*/
	}

}
