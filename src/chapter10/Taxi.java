package chapter10;

public class Taxi extends Car {
	
	private int maxNum;

	public int getMaxNum() {
		return maxNum;
	}
	
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	public void wash() {
		System.out.println("택시 : 세차합니다");
	}
	
	@Override
	public void go(int distance) {
		System.out.println("택시를 타고 "+distance+"km 이동한다.");
		System.out.println("연료:"+this.getOilSize());
	}

}
