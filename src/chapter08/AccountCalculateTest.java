package chapter08;

public class AccountCalculateTest {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		
		for(int i=0; i<accounts.length; i++) {
			accounts[i] = new Account("111-2222-555"+(i+1),10000*(i+1),4.5);
					System.out.println("���¹�ȣ : "+accounts[i].getName()+"/ �ܾ� : "+accounts[i].getBaln() +
							"��/ �̿� :"+accounts[i].getInterRate()+"%" ); 
					
		}
		System.out.println("������ �����մϴ�.");
		for(int i=0; i<accounts.length; i++) {
			accounts[i].setInterRate(3.7);
			accounts[i].CalculateInterRate();
					System.out.println("���¹�ȣ : "+accounts[i].getName()+
							"/ �̿� :"+accounts[i].getInterRate()+"%"+
							"/ �ܾ� : "+(accounts[i].getBaln())+"��"); 
												
		}
//Re
	}
}
