package chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int sum =0;
		double aver =0.0;
		for(int i=0; i<=500; i++) {
			sum+=i;		
		}
		aver=(double)sum/500;//sum�� double���̵Ǵϱ� �Ǽ�/�Ǽ� ���� �Ǽ� �Ҽ������� ���´�.
		System.out.println(aver);
		System.out.println(sum);
	}

}
