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
		this(model, osVer, production);//위에 저걸 호출 걍 세줄 대신 넣은거
		this.sales = sales;
	}
	
	void printComputerInfo() {
		System.out.println("==="+this.model+"("+osVer+")===");
		System.out.println("생산 : " + this.production+"/판매 : "+ sales);
		//sales 는 this.sales 해도 된다 (osVer도??)//??
	}
}
