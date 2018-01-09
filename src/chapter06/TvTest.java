package chapter06;

public class TvTest {

	public static void main(String[] args) {
		Tv infinia = new Tv("INFINIA",1500000);
		infinia.printTvInfo();
		Tv xcanvas = new Tv("XCANVAS",1000000,"LCD TV");
		xcanvas.printTvInfo();
		Tv cinema = new Tv("CINEMA",2000000,"3D TV");
		cinema.printTvInfo();
		
		int totalPrice = infinia.price + xcanvas.price + cinema.price;//¾ý ÀÌ¹ø²« »ý°¢¾ÈÇÔ
		System.out.println("ÃÑÇÕ : " + totalPrice);
	}

}
