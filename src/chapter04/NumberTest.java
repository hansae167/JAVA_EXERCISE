package chapter04;

public class NumberTest {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num + "은 양수입니까?" + (num>=0));
		System.out.println(num + "은 짝수입니까?" + (num%2==0));
		System.out.println(num + "은 홀수입니까?" + (num%2==1));
		System.out.println(num + "은 30보다 큽니까?" + (num>30));

	
	}

}
