package chapter06;

public class Car {				
	int oilAm;//oil amount
	double carDis;//car distance
	
	void addOill(int newOil) {
		System.out.println("휘발유 "+newOil+"L 주유합니다.");
		oilAm += newOil;//0으로 (초기화) 두지 않아도 된다.
	}
	
	void driveCar(String start, String end, double distance) {
		System.out.println(start + "에서 "+ end + "까지" + distance + "km 주행하였습니다.");
		carDis += distance;
		oilAm = (int)(oilAm-(distance/20));//
	}
	
	void carInfo() {
		System.out.println("[ICE 카] 남은 기름 양 : "+ oilAm + "L, 총 주행거리 : " + carDis);
	}
	
	double calculateCar() {
		double distance= 0.0;
		distance = oilAm*20;
		return distance;
	}
}
