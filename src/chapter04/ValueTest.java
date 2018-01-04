package chapter04;

public class ValueTest {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 60;
		int sum = 0;
		sum = num1 + num2;
		num1+=num2;//num1은 110이 됨 위에선 sum은 아직 60+50이라 110이다
		
		System.out.println(sum);
		System.out.println(num1);
//+중요 설명    num1+=num2 >>> num1= num1+num2 이다(저 =옆에 연산자가 ㅜㅁ엇이든 동일함.)
	}

}
