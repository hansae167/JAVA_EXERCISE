package chapter06;

public class Car {				
	int oilAm;//oil amount
	double carDis;//car distance
	
	void addOill(int newOil) {
		System.out.println("�ֹ��� "+newOil+"L �����մϴ�.");
		oilAm += newOil;//0���� (�ʱ�ȭ) ���� �ʾƵ� �ȴ�.
	}
	
	void driveCar(String start, String end, double distance) {
		System.out.println(start + "���� "+ end + "����" + distance + "km �����Ͽ����ϴ�.");
		carDis += distance;
		oilAm = (int)(oilAm-(distance/20));//
	}
	
	void carInfo() {
		System.out.println("[ICE ī] ���� �⸧ �� : "+ oilAm + "L, �� ����Ÿ� : " + carDis);
	}
	
	double calculateCar() {
		double distance= 0.0;
		distance = oilAm*20;
		return distance;
	}
}
