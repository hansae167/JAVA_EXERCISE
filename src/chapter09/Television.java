package chapter09;

public class Television extends Product{
	private String descr;//description
	
	public String getDescr() {
		return descr;
	}
	
	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Television(String name, int price, int discoRate, String descr) {
		super(name, price, discoRate);
		this.descr = descr;
	}           

}
