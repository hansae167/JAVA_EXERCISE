package chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int[] score = {93,97,80};
		String[] subject = {"국어","영어","수학"};
		double avg =0.0;
		int sum= 0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			System.out.println(subject[i]+":"+score[i]);
		}
		avg = (double)(sum)/score.length; 
		/*
		System.out.println("국어 : "+score[0]);
		System.out.println("영어 : "+score[1]);
		System.out.println("수학 : "+score[2]);
		System.out.println("평균 : "+avg); //위에걸 subject 만들고 for문에 추가함 
		*/
		System.out.println("평균 : "+avg);
		System.out.println("합계 : "+sum);
	}

}
