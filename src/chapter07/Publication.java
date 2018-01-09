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
			System.out.println("[에러] 가격정보는 음수를 입력할수 없습니다.");
		}else {
		this.price = price;
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPage(int page) {
		if(page<0) {
			System.out.println("[에러] 페이지정보는 음수를 입력할수 없습니다.");
		}else {
		this.page = page;
		}
	}
	
	public int getPage() {
		return page;
	}//이게 두개(set,get)가 한세트 이다, 뭔가 규칙이 보이긴 하다
	
	public static void printHeader() {
		System.out.println("=====도서 정보 조회=====");
		
	}
}
