package chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount fundAcc1 = new FundAccount("111-2222","È«ÀÍÀÎ°£",5000000,4.7);
		FundAccount fundAcc2 = new FundAccount("133-2222","È«»ï",1000000,2.9);
		fundAcc1.openAccount();
		
		fundAcc1.earnMoney();
		fundAcc2.earnMoney();
		
	}

}
