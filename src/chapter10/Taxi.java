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
		System.out.println("�ý� : �����մϴ�");
	}
	
	@Override
	public void go(int distance) {
		System.out.println("�ýø� Ÿ�� "+distance+"km �̵��Ѵ�.");
		System.out.println("����:"+this.getOilSize());
	}

}
