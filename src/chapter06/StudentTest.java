package chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.stuName = "ȫ�浿";
		hong.stuId = "stu001";
		hong.korSc = 94;
		hong.engSc = 80;
		hong.mathSc = 89;
		
		hong.printStudentInfo();
		
		System.out.println("�й� ����");
		hong.changeStudentId("STuDENT001");
		
		hong.printStudentInfo();
	}

}
