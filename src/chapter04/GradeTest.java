package chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int score = 75;
		
		boolean res1 = (score <= 100) && (score >= 90); //result1 ��ȣ�� �ĳ����� ���⽱��.
		System.out.println("A���� : " +res1);
		
		boolean res2 = (score < 90) && (score >= 80); //result2 
		System.out.println("B���� : " +res2);
		
		boolean res3 = (score < 80) && (score >= 70); //result3
		System.out.println("C���� : " +res3);
		
		boolean res4 = (score < 70) && (score >= 60); //result4
		//�տ����� �������� ������ �ڿ��� �ƿ� ���� �ʴ´� &&�̴ϱ�
		System.out.println("D���� : " +res4);

	}

}
