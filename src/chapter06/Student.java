package chapter06;

public class Student {
	String stuName;
	String stuId;
	
	int korSc;	
	int engSc;	
	int mathSc;	
	int avgSc;
	//�ʱ�ȭ �� �ʿ� ���� (���ݸ� �׷��ǰ�?)
	
	void printStudentInfo(){ 
		System.out.println("�л� �̸� : " +stuName);
		System.out.println("�л� ��ȣ : " +stuId);
		System.out.println("���� ���� : " +engSc);
		System.out.println("���� ���� : " +mathSc);
		System.out.println("���� ���� : " +korSc);
		System.out.println("���� ���� : " +(mathSc+engSc+korSc));
		System.out.println("���� ��� : " +calculateAvg());
	}
	
	int calculateAvg(){
		avgSc =(korSc+engSc+mathSc)/3;
		return avgSc;
	}
	
	void changeStudentId(String newStuId){
		stuId = newStuId;
	}
}


