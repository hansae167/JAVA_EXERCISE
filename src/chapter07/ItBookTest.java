package chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus", 50000,5.5);
		sql.printItBookInfo();
		
		ItBook java = new ItBook("JAVA 2.0", 28000,3.2);
		java.printItBookInfo();
		
		ItBook servlet = new ItBook("Servlet/JSP", 37000,6.9);
		servlet.printItBookInfo();
		
		System.out.println(sql.getTitle()+"의 정가와 할인율을 변경합니다.");
		sql.setPrice(5000);
		sql.setDisRate(9.5);
		sql.printItBookInfo();
		
		System.out.println(java.getTitle()+"의 정가를 변경합니다.");
		java.setPrice(33000);
		java.printItBookInfo();
		
		System.out.println(servlet.getTitle()+"의 제목과 할인율을 변경합니다.");
		servlet.setTitle("Servlet&JSP");
		servlet.setDisRate(12.6);
		servlet.printItBookInfo();
	}
	

}
