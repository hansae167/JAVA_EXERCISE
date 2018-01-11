package chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		/*
		 * Chocolate[] chocos = new Chocolate[3];
		chocos[0] = new Chocolate("아마도라", "다크", 2200);
		chocos[1] = new Chocolate("카페기리쉬", "다크", 2500);
		chocos[2] = new Chocolate("트리플 볼랑","화이트",2300);
		//위에게 좀 불편한 예제
		*/
		Chocolate[] chocos = { new Chocolate("아마도라", "다크", 2200), new Chocolate("카페기리쉬", "다크", 2500),
				new Chocolate("트리플 볼랑","화이트",2300)};
		//이렇게 한번에 하면 편하다
		
		chocos[0].printChocolateInfo();
		chocos[1].printChocolateInfo();
		chocos[2].printChocolateInfo();
		
		
	}

}
