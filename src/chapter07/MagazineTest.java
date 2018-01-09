package chapter07;

public class MagazineTest {

	public static void main(String[] args) {
		Magazine mag1 = new Magazine("Maxim", 15000);
		/*
		mag1.name = "XXX";
		mag1.price = 5000;//접근제한을 해서  클래스에만 보이고 다른곳에선 안보이게 함(그래서 이 방법은 안 먹힘)
		*/
		mag1.setName("뿌리깊은나무");
		mag1.setPrice(5000);//이렇게 메서드를 만들고 불러서 할 수 있다.
		
		Magazine mag2 = new Magazine("Cosmopolitan0", 30000);
		String title = mag2.getName();
		int price = mag2.getPrice();//이렇게도 가능
		System.out.println(title+" : "+price);
		//이 메서드 둘은 (?)getter , setter로 불린다.
	}

}
