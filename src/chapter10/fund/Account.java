package chapter10.fund;

public class Account {
	private String number;
	private String name;
	private int balance;
	
	public Account(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void openAccount() {
		System.out.println("°èÁÂ¹øÈ£ : " +getNumber());
		System.out.println("¿¹±ÝÁÖ : " +getName());
		System.out.println("ÀÜ¾× : " +getBalance());
	}
	                 
	
	
	
	
	
}
