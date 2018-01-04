package chapter04;

public class TemperatureTest {

	public static void main(String[] args) {
		int farn = 100; //farnheit
		double celc = 5.0/9.0 * (farn-32); //celcius //5/9는 0 이다. 실수형으로 하자
		double cel = (double)5/9 * (farn-32); //이렇게 실수형으로 해도 된다
		double yee = 5;//좋은 방법이 아님
		double pee = 9;
		System.out.println("화씨:" + farn);
		System.out.println("섭씨:" + celc);
		System.out.println(yee/pee);
		System.out.println(cel);
	}

}
