package chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car cars[] = {new Car(), new Taxi(), new Truck()};
		cars[0].wash();
		cars[1].wash();
		cars[2].wash();
		

		//인터페이스 테스트 때문에 지움
		
		/*cars[0].go(30);
		cars[0].go(20);*/
		
		//cars[0].setOilSize(10);
		//cars[0].go(20);
		//((Taxi)cars[0]).setMaxNum(4);
		//**캐스팅 함 메서드 호출하기 위해서 (위에걸 다 Car의 객체로 뒀으니)
		//System.out.println("택시 정원  : "+((Taxi)cars[0]).getMaxNum()+"명");
		
		//cars[1].setOilSize(10);
		//cars[1].go(30);
		//((Truck)cars[1]).setMaxWei(100);
		//System.out.println("트럭 무게  :  "+((Truck)cars[1]).getMaxWei()+"kg");
		
		
		
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
