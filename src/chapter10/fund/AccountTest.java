package chapter10.fund;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount fundAcc1 = new FundAccount("111-2222","ȫ���ΰ�",5000000,4.7);//��� �����ʰ��� �����ڸ� ���ϴ°���.
		FundAccount fundAcc2 = new FundAccount("133-2222","ȫ��",1000000,2.9);
		fundAcc1.openAccount();
		
		fundAcc1.earnMoney();
		fundAcc2.earnMoney();
		
	}

}
