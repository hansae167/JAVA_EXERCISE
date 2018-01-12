package chapter10.fund;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount fundAcc1 = new FundAccount("111-2222","홍익인간",5000000,4.7);//사실 오른쪽것이 생성자를 말하는거임.
		FundAccount fundAcc2 = new FundAccount("133-2222","홍삼",1000000,2.9);
		fundAcc1.openAccount();
		
		fundAcc1.earnMoney();
		fundAcc2.earnMoney();
		
	}

}
