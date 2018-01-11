package chapter08;

public class Account {
	private String name;
	private int baln;//balance
 	private double interRate;//interestRate
 	
	public Account(String name, int baln, double intRate) {
		this.name = name;
		this.baln = baln;
		this.interRate = intRate;
	}

	public String getName() {
		return name;
	}

	public int getBaln() {
		return baln;
	}

	public void setBaln(int baln) {
		this.baln = baln;
	}

	public double getInterRate() {
		return interRate;
	}

	public void setInterRate(double intRate) {
		this.interRate = intRate;
	}
 	
	public void CalculateInterRate() {
		int inter=(int)(baln*interRate/100);
		baln += inter;
	}
 	
}
