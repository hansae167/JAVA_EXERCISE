package chapter06;

public class Computer {
	String model;
	String osVer;
	int production;
	int sales;
	
	Computer(String model, String osVer, int production){
		this.model = model;
		this.osVer = osVer;
		this.production = production;
	}
	
	Computer(String model, String osVer, int production, int sales){
		this(model, osVer, production);//���� ���� ȣ�� �� ���� ��� ������
		this.sales = sales;
	}
	
	void printComputerInfo() {
		System.out.println("==="+this.model+"("+osVer+")===");
		System.out.println("���� : " + this.production+"/�Ǹ� : "+ sales);
		//sales �� this.sales �ص� �ȴ� (osVer��??)//??
	}
}
