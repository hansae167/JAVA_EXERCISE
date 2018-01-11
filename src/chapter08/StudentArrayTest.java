package chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student[] stu = new Student[3];
		
		stu[0] = new Student("장갑찬","STU001","010-1234-1234");
		stu[1] = new Student("릐순싄","STU002","010-1234-5678");
		stu[2] = new Student("재유신","STU003","010-4321-1234");

		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].getName()+"("+stu[i].getId()+")/전화번호:"+
							stu[i].getPhoneNum());
						
		}
	}

}
