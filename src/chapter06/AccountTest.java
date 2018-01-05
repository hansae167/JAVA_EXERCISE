package chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account hong = new Account();
		hong.accName = "홍길동";
		hong.accNum = "123-456789";
		hong.balance = 10000;
		
		hong.printAccountInfo();//정보
	
		hong.deposit(20000);//입금
		hong.deposit(-20000);//입금-(음수라서 에러)
		
		hong.withdraw(-45000);//출금-(음수라서 에러)
		hong.withdraw(45000);//출금-(잔액이부족해서 경고)
		hong.withdraw(15000);//출금
		
	}

}
