package chapter10;

public class Car implements Washer{
	private int oilSize;

	public int getOilSize() {
		return oilSize;
	}

	public void wash() {
		System.out.println("세차합니다.");
	}
	
	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	
	public void go(int distance) {
		System.out.println(distance+"km 이동한다.");
		System.out.println("연료:"+this.oilSize);
	}
}
