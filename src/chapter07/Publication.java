package chapter07;

public class Publication {
	String title;
	int price;
	int page;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitile() {
		return title;
	}
	
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("[����] ���������� ������ �Է��Ҽ� �����ϴ�.");
		}else {
		this.price = price;
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPage(int page) {
		if(page<0) {
			System.out.println("[����] ������������ ������ �Է��Ҽ� �����ϴ�.");
		}else {
		this.page = page;
		}
	}
	
	public int getPage() {
		return page;
	}//�̰� �ΰ�(set,get)�� �Ѽ�Ʈ �̴�, ���� ��Ģ�� ���̱� �ϴ�
	
	public static void printHeader() {
		System.out.println("=====���� ���� ��ȸ=====");
		
	}
}
