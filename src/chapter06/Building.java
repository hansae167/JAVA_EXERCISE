package chapter06;

public class Building {
	String name;
	String address;
	int totalfloor;
	
	void moveElevator() {
		System.out.println("엘베를 운영합니다.");
	}
	
	void changeAddress(String newAddress){
		address = newAddress;
		}
}//클래스 만들기 실습
