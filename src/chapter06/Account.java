package chapter06;

public class Account {
	String accNum;
	String accName;
	int balance;//잔액
	
	void deposit(int money) {
		if(money<0) {
			System.out.println("[error:금액은 음수를 입력할 수 없습니다.]");
		}else {
		balance+=money;
		System.out.println("잔액 : " + balance + "원");//
		}//입금
	}
	void withdraw(int money) {
		System.out.println(money+"원을 출금합니다.");
		if(money < 0) {
			System.out.println("[error:금액은 음수를 입력할 수 없습니다.]");
		}else if(money>balance){
			System.out.println("[error:잔액이 부족합니다.]");
		}else {
		balance-=money;
		System.out.println("잔액 : " + balance + "원");
		}
	}//출금
	
	void printAccountInfo() {
		System.out.println("계좌 : " + accNum + "(예금주 : " + accName + ")");
		System.out.println("잔액 : " + balance);
	}//정보
}
