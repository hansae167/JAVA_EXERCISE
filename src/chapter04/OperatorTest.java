package chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int num = 64;
		System.out.println("짝수입니까? : " +(num % 2 ==0));
		System.out.println("3의배수입니까? : " +(num % 3 ==0));
		System.out.println("2의 배수면서 7의 배수입니까? : " +((num % 2 ==0) && (num % 7 ==0)));//괄호잘 봐라
		System.out.println("2의 배수이거나 7의 배수입니까? : " +((num % 2 ==0) || (num % 7 ==0)));
	}

}
