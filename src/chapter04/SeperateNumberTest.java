package chapter04;

public class SeperateNumberTest {
//각 자리 출력하기
	public static void main(String[] args) {
		//중요
		int num = 456;
		int num100 = num/100;//4.56이지만 몫만 출력하므로 4만 나옴 (또한 int 이니)
		int num10 = (num/10)%10;//45에다가 %10을 해서 나머지 5만 나옴
		int num1 = (num%10);//45.6에서  나머지 6만 나옴
		int num1_2 = (num%100)%10;//사실상 위에보다 이게 정석임 456>56>6
		//생각해봐
		System.out.println(num);
		System.out.println(num100);
		System.out.println(num10);
		System.out.println(num1);
		System.out.println(num1_2);
	}

}
