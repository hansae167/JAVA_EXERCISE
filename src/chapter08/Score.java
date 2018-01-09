package chapter08;

public class Score {
	String [] subject;
	int [] scores = new int[3];
	
	Score(){

	subject = new String[3];
	subject[0] = "국어";
	subject[1] = "영어";
	subject[2] = "수학";
	}
	
	void printScore(){
		for(int i=0; i<3; i++) {
			System.out.println(scores[i]);
		}
	}
	
	void printSubject(){
		for(int i=0; i<3; i++) {
			System.out.println(subject[i]);
		}
	}
	
	int calcAVG() {
		return (scores[0] + scores[1] + scores[2])/3;
	}
}
