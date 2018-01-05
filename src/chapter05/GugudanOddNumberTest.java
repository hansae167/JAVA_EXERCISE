package chapter05;

public class GugudanOddNumberTest {

	public static void main(String[] args) {
	
		int i=2;
		while(i<=5) {
			int j=1;
			while(j<=9) {
				if((i*j)%2==1){
					System.out.println(i*j);
				}
				j++;
			}
		System.out.println();
			i++;
		}

	}

}
