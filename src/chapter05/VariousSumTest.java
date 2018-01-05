package chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int totalSum = 0;
		int oddSum = 0;
		int evenSum = 0;
		for(int i=0; i<=1000; i++) {
			totalSum+=i;
			if(i%2==0) {
				evenSum+=i;
			}else if(i%2!=0) {
				oddSum+=i;
			}
		}
			System.out.println("total : " + totalSum);
			System.out.println("odd : " + oddSum);
			System.out.println("even : " + evenSum);
	}

}
