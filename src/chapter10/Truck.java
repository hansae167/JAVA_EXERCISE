package chapter10;

public class Truck extends Car{
	
	private int maxWei;//max weight

	public int getMaxWei() {
		return maxWei;
	}
	
	public void setMaxWei(int maxWei) {
		this.maxWei = maxWei;
	}
	
	public void wash() {
		System.out.println("Ʈ�� : �����մϴ�");
	}
	
	@Override
	public void go(int distance) {
		System.out.println("Ʈ���� Ÿ�� "+distance+"km �̵��Ѵ�.");
		System.out.println("����:"+this.getOilSize());
	}

}
