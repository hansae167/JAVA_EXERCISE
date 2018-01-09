package chapter07;

public class ItBook {
	private String title;
	private int price;
	private double disRate;//discount rate
	
	
	public ItBook(String title, int price, double disRate) {
		this.title = title;
		this.price = price;
		this.disRate = disRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDisRate() {
		return disRate;
	}

	public void setDisRate(double disRate) {
		this.disRate = disRate;
	}

	public void printItBookInfo() {
		System.out.println("제목 : " + title + ", 정가 : " + price + "원, 할인율 : " +disRate + " 할인가 : " +calculateDisPrice());
	}
	
	int calculateDisPrice() {
		int disPrice = (int)(price*(100-disRate)/100);
		return disPrice;//이 놈은 다시 공부 하자
		
	}
	
	
}
