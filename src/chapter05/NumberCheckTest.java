package chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int num1 =2;
		int num2 =82;
		int res =num1 * num2;//result
		
		if(res<0){
			System.out.println("�������մϴ�.");
		}
		else if(res==0) {
			System.out.println("0�Դϴ�.");
		}
		else if((res>=1)&&(res<10)) {
			System.out.println("���ڸ����Դϴ�.");
		}
		else if((res>=10)&&(res<100)){
			System.out.println("���ڸ����Դϴ�.");
		}
		else if(res>=100) {
			System.out.println("���ڸ��� �̻��Դϴ�.");
		}
		else
			System.out.println("�����Դϴ�.");

	}

}
