package chapter09;

public class FundAccount extends Account {
	private double earnRate;//earning rate
	
	public FundAccount(String number, String name,int balance, double earnRate) {
		super(number,name,balance);//�θ𿡰Լ�
		this.earnRate = earnRate;
	}

	public double getEarnRate() {
		return earnRate;
	}

	public void setEarnRate(double earnRate) {
		this.earnRate = earnRate;
	}
	
	public void earnMoney() {
		System.out.println("���͹߻�");
	}
	
		@Override
		public void openAccount() {
			System.out.println("���¸� �����մϴ�.");
			System.out.println("�ݵ�");
			super.openAccount();//�θ� �޼��� ����
			System.out.println("���ͷ� : "+getEarnRate());
			
		}
	}
	


