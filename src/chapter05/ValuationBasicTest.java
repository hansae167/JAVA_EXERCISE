package chapter05;

public class ValuationBasicTest {

	public static void main(String[] args) {
		int firstnum = 10;
		int secondnum = 20;
		int thirdnum = 40;
		int forthnum = 50;
		int fifthnum = 80;
		
		double result = 0;//0으로 두는걸 초기화라고도 한다
		result += firstnum * secondnum /2*0.6;
		result += (thirdnum + forthnum) /2*0.13;
		result += fifthnum*0.27;
		//원래 6/10, 13/100, 27/100 같이 했지만 이렇게 하는게 더 낫다 값이 다르게 나옴
		System.out.println("평가점수 : " +result);
		if(result >= 95 && result <= 100) {
			System.out.println("Special Class입니다");
		}else if(result >= 90) {
			System.out.println("Gold Class입니다.");
		}else if(result >= 85) {
			System.out.println("Silver Class입니다.");
		}else if(result >= 80) {
			System.out.println("Bronze Class입니다.");
		}else{
			System.out.println("Member입니다.");//조건의 순서도 생각해봐야 한다
		}//??
		

	}

}
