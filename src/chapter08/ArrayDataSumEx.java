package chapter08;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		int nums[] = {11,22,33,44,55,66,77,88,99};
		int sum = 0;
		
		System.out.println("�迭�� ���� : ");
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.print(nums[i]+" ");
		}//�Ʒ��� �� ���� for�� ���� ���� ������ ��
		
		/*
		System.out.println("�迭�� ���� : ");
		for(int i=0; i <nums.length; i++) {
			System.out.print(nums[i]+" ");//�� num.length�� �� ���̸� ���� ����� �̷��� �̿��� �� ����.
		}
		*/
		System.out.println();
		System.out.println("�հ� : "+sum);

	}

}
