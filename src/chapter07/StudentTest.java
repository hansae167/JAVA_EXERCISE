package chapter07;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("생성 학생수 : "+ Student.STUDENT_NO);
		
		Student stu1 = new Student("홍길동", "STU001",4);
		Student stu2 = new Student("통일동", "STU002",1);
		Student stu3 = new Student("홍갈등", "STU003",2);
		Student stu4 = new Student("홍갈증", "STU004",3);
		
		System.out.println("생성학생수 : "+Student.STUDENT_NO);
		System.out.println("생성학생수 : "+stu1.STUDENT_NO);
		System.out.println("생성학생수 : "+stu2.STUDENT_NO);
		//오류뜸 다시하자
		
		
	}

}
