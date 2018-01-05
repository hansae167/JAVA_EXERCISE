package chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int num1 =2;
		int num2 =82;
		int res =num1 * num2;//result
		
		if(res<0){
			System.out.println("음수안합니다.");
		}
		else if(res==0) {
			System.out.println("0입니다.");
		}
		else if((res>=1)&&(res<10)) {
			System.out.println("한자리수입니다.");
		}
		else if((res>=10)&&(res<100)){
			System.out.println("두자리수입니다.");
		}
		else if(res>=100) {
			System.out.println("세자리수 이상입니다.");
		}
		else
			System.out.println("오류입니다.");

	}

}
