package chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account hong = new Account();
		hong.accName = "ȫ�浿";
		hong.accNum = "123-456789";
		hong.balance = 10000;
		
		hong.printAccountInfo();//����
	
		hong.deposit(20000);//�Ա�
		hong.deposit(-20000);//�Ա�-(������ ����)
		
		hong.withdraw(-45000);//���-(������ ����)
		hong.withdraw(45000);//���-(�ܾ��̺����ؼ� ���)
		hong.withdraw(15000);//���
		
	}

}
