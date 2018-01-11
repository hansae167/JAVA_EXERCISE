package chapter08;

public class Swap {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = a;
		//b와 a 서로 바꾸기
		a=b;
		b=c;
		//중요한 개념임. 새로운 변수가 컵에 음료수를 서로 바꿀 떄 대신 담아주는  컵이라 생각하자
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}

}
