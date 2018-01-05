package chapter05;

public class ForXEx {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");//
			}
			System.out.println();//ln있으니 걍 한칸내려주는 역할
		}


	}

}
