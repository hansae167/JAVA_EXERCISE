package chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student[] stu = new Student[3];
		
		stu[0] = new Student("�尩��","STU001","010-1234-1234");
		stu[1] = new Student("�l����","STU002","010-1234-5678");
		stu[2] = new Student("������","STU003","010-4321-1234");

		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].getName()+"("+stu[i].getId()+")/��ȭ��ȣ:"+
							stu[i].getPhoneNum());
						
		}
	}

}
