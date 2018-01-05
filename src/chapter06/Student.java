package chapter06;

public class Student {
	String stuName;
	String stuId;
	
	int korSc;	
	int engSc;	
	int mathSc;	
	int avgSc;
	//초기화 할 필요 없다 (지금만 그런건가?)
	
	void printStudentInfo(){ 
		System.out.println("학생 이름 : " +stuName);
		System.out.println("학생 번호 : " +stuId);
		System.out.println("영어 성적 : " +engSc);
		System.out.println("수학 성적 : " +mathSc);
		System.out.println("국어 성적 : " +korSc);
		System.out.println("성적 총점 : " +(mathSc+engSc+korSc));
		System.out.println("성적 평균 : " +calculateAvg());
	}
	
	int calculateAvg(){
		avgSc =(korSc+engSc+mathSc)/3;
		return avgSc;
	}
	
	void changeStudentId(String newStuId){
		stuId = newStuId;
	}
}


