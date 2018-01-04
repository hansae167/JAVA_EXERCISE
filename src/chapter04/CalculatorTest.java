package chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 7;
		int addRes= num1 + num2;
		int subRes= num1 - num2;
		int mulRes= num1 * num2;
		int divRes= num1 / num2;
		int remRes= num1 % num2;
		System.out.println("덧셈결과:" + (num1+num2));//이거 아니면 둘다더한 변수를 만들어서
		System.out.println("덧셈결과:" + addRes);//이런꼴로도 가능  아니면 그 결과를 여러번 쓸때 쓰인다(사실 메모리 더 쓰이는거라)
		System.out.println("뺼셈결과:" + subRes);
		System.out.println("곱셈결과:" + mulRes);
		System.out.println("나눗셈결과:" + divRes);
		System.out.println("나머지결과:" + remRes);		
		

	}

}
