package chapter09;

public class FundAccount extends Account {
	private double earnRate;//earning rate
	
	public FundAccount(String number, String name,int balance, double earnRate) {
		super(number,name,balance);//부모에게서
		this.earnRate = earnRate;
	}

	public double getEarnRate() {
		return earnRate;
	}

	public void setEarnRate(double earnRate) {
		this.earnRate = earnRate;
	}
	
	public void earnMoney() {
		System.out.println("수익발생");
	}
	
		@Override
		public void openAccount() {
			System.out.println("계좌를 개설합니다.");
			System.out.println("펀드");
			super.openAccount();//부모 메서드 실행
			System.out.println("수익률 : "+getEarnRate());
			
		}
	}
	


