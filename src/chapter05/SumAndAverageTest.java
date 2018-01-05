package chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int sum =0;
		double aver =0.0;
		for(int i=0; i<=500; i++) {
			sum+=i;		
		}
		aver=(double)sum/500;//sum이 double형이되니까 실수/실수 꼴이 되서 소수점값이 나온다.
		System.out.println(aver);
		System.out.println(sum);
	}

}
