package chapter05;

public class SwitchCaseEx {

	public static void main(String[] args) {
		int firstnum = 10;
		int secondnum = 20;
		int thirdnum = 40;
		int forthnum = 50;
		int fifthnum = 80;
		
		double result = 0;//0���� �δ°� �ʱ�ȭ��� �Ѵ�
		result += firstnum * secondnum /2*0.6;
		result += (thirdnum + forthnum) /2*0.13;
		result += fifthnum*0.27;
		//���� 6/10, 13/100, 27/100 ���� ������ �̷��� �ϴ°� �� ���� ���� �ٸ��� ����
		System.out.println("������ : " +result);
		
		/*if(result >= 95 && result <= 100) {
			System.out.println("Special Class�Դϴ�");
		}else if(result >= 90) {
			System.out.println("Gold Class�Դϴ�.");
		}else if(result >= 85) {
			System.out.println("Silver Class�Դϴ�.");
		}else if(result >= 80) {
			System.out.println("Bronze Class�Դϴ�.");
		}else{
			System.out.println("Member�Դϴ�.");//������ ������ �����غ��� �Ѵ�
		}*/
		//??
		
		switch((int)result/10) 
		//switch �� ���� �̷��� ���氡���ϰ� �׳� ���� �־ �ȴ�
		{
		case 10 :
		case 9 : System.out.println("Special Class"); break;
		case 8 : System.out.println("Gold Class"); break;
		case 7 : System.out.println("Silver Class"); break;
		case 6 : System.out.println("Bronze Class"); break;
		default : System.out.println("Member"); break;	
		}//switch�� �Ǽ� ����� �Ұ����ϴ�
	}

}
