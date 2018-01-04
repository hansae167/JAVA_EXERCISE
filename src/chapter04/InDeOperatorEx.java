package chapter04;

public class InDeOperatorEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(++num1);//num1 에다 1을 더한 다음 값을 출력(대입)
		System.out.println(num2++);//num2 을 출력후(대입) 1을 더함
		
		int res = --num1 + num2--; //생각해 보자
				
		System.out.println(res);
	}

}
