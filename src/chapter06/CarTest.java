package chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car iceCar = new Car();
		iceCar.oilAm = 5;
		iceCar.carDis = 140.0;
		
		iceCar.carInfo();
		
		iceCar.addOill(10);
		iceCar.carInfo();
		
		iceCar.driveCar("IT����", "��õ����", 10.17);
		iceCar.carInfo();
		
		iceCar.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		iceCar.carInfo();
		
		double enableDis = iceCar.calculateCar();
		
		System.out.println("���డ�� �Ÿ��� �� "+ enableDis+"km �Դϴ�.");

	}

}
