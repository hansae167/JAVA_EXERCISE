package chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		Publication pub1 = new Publication();
		System.out.println("==========출판물 정보를 세팅합니다.==========");
		pub1.setPrice(-10000);
		pub1.setPrice(5000);
		pub1.setTitle("만화 삼국지");
		pub1.setPage(-20);
		pub1.setPage(300);
		System.out.println("출판물 정보 : " + pub1.getTitile()+"("+pub1.getPrice()+"원, "+pub1.getPage()+"pg)");
		
		
	}

}
