
package chapter07;

public class Publicationtest2 {

	public static void main(String[] args) {
		
		Publication pub1 = new Publication();
		Publication.printHeader();
		
		pub1.setPrice(-10000);
		pub1.setPrice(5000);
		pub1.setTitle("��ȭ �ﱹ��");
		pub1.setPage(-20);
		pub1.setPage(300);
		System.out.println("���ǹ� ���� : " + pub1.getTitile()+"("+pub1.getPrice()+"��, "+pub1.getPage()+"pg)");
		
		
	}

}

