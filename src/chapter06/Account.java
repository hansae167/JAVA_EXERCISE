package chapter06;

public class Account {
	String accNum;
	String accName;
	int balance;//�ܾ�
	
	void deposit(int money) {
		if(money<0) {
			System.out.println("[error:�ݾ��� ������ �Է��� �� �����ϴ�.]");
		}else {
		balance+=money;
		System.out.println("�ܾ� : " + balance + "��");//
		}//�Ա�
	}
	void withdraw(int money) {
		System.out.println(money+"���� ����մϴ�.");
		if(money < 0) {
			System.out.println("[error:�ݾ��� ������ �Է��� �� �����ϴ�.]");
		}else if(money>balance){
			System.out.println("[error:�ܾ��� �����մϴ�.]");
		}else {
		balance-=money;
		System.out.println("�ܾ� : " + balance + "��");
		}
	}//���
	
	void printAccountInfo() {
		System.out.println("���� : " + accNum + "(������ : " + accName + ")");
		System.out.println("�ܾ� : " + balance);
	}//����
}
