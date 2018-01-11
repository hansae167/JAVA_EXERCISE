package chapter08;

public class AccountCalculateTest {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		
		for(int i=0; i<accounts.length; i++) {
			accounts[i] = new Account("111-2222-555"+(i+1),10000*(i+1),4.5);
					System.out.println("계좌번호 : "+accounts[i].getName()+"/ 잔액 : "+accounts[i].getBaln() +
							"원/ 이울 :"+accounts[i].getInterRate()+"%" ); 
					
		}
		System.out.println("이율을 변경합니다.");
		for(int i=0; i<accounts.length; i++) {
			accounts[i].setInterRate(3.7);
			accounts[i].CalculateInterRate();
					System.out.println("계좌번호 : "+accounts[i].getName()+
							"/ 이울 :"+accounts[i].getInterRate()+"%"+
							"/ 잔액 : "+(accounts[i].getBaln())+"원"); 
												
		}
//Re
	}
}
