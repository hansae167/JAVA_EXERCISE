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
		System.out.println("트럭 : 세차합니다");
	}
	
	@Override
	public void go(int distance) {
		System.out.println("트럭을 타고 "+distance+"km 이동한다.");
		System.out.println("연료:"+this.getOilSize());
	}

}
