package chapter06;

public class BuildingTest {
//어떤 행동을 하는것은 () 이 있다고 생각하자-(선생님)
	public static void main(String[] args) {
		Building build1 = new Building();//Building이라는 클래스에 build1이란 객체 생성(?)
		build1.name = "국제선타원";
		build1.address = "윤서동";
		build1.totalfloor =5;
		//여기엔 없지만 다른곳에 만든 자바파일에 클래스랑 메서드 등 다 있다.
		System.out.println("건물명 : " + build1.name);
		System.out.println("주소 : " + build1.address);
		System.out.println("층수 : " + build1.totalfloor);
		build1.moveElevator();
		System.out.println("변경후");
		build1.changeAddress("김포동");
		System.out.println("건물명 : " + build1.name);
		System.out.println("주소 : " + build1.address);
		System.out.println("층수 : " + build1.totalfloor);//Building.java 살펴보자
	}

}
