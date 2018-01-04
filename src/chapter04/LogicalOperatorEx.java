package chapter04;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		 
		boolean res1 = (num1 > num2) && (num1 > 5);//Result1
		boolean res2 = (num1 > num2) && (num1 == num2);//Result2
		boolean res3 = (num1 <= num2) || (num1 != num2);//Result3
		boolean res4 = (num1 <= num2) || !(num1 >num2);//Result4
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(!res4);

	}

}
