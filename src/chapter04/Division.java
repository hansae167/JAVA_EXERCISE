package chapter04;

public class Division {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		int divRes = num1/num2;
		int remainRes = num1%num2;
		
		System.out.println(num1+"/"+num2);//그대로 출력
		System.out.println("나눗셈결과:"+ divRes);
		System.out.println("나머지:" + remainRes);
	}

}
