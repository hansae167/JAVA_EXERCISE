package chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car iceCar = new Car();
		iceCar.oilAm = 5;
		iceCar.carDis = 140.0;
		
		iceCar.carInfo();
		
		iceCar.addOill(10);
		iceCar.carInfo();
		
		iceCar.driveCar("IT센터", "인천공항", 10.17);
		iceCar.carInfo();
		
		iceCar.driveCar("인천공항", "곤지암리조트", 60.21);
		iceCar.carInfo();
		
		double enableDis = iceCar.calculateCar();
		
		System.out.println("주행가능 거리는 약 "+ enableDis+"km 입니다.");

	}

}
