package chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int[] score = {93,97,80};
		String[] subject = {"����","����","����"};
		double avg =0.0;
		int sum= 0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			System.out.println(subject[i]+":"+score[i]);
		}
		avg = (double)(sum)/score.length; 
		/*
		System.out.println("���� : "+score[0]);
		System.out.println("���� : "+score[1]);
		System.out.println("���� : "+score[2]);
		System.out.println("��� : "+avg); //������ subject ����� for���� �߰��� 
		*/
		System.out.println("��� : "+avg);
		System.out.println("�հ� : "+sum);
	}

}
