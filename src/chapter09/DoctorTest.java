package chapter09;

public class DoctorTest {

	public static void main(String[] args) {
		Dentist dent = new Dentist("��EH��");
		System.out.println(dent.getDepart()+":"+dent.getName());
		dent.treatPatient();
		dent.pullOutTooth();
		
	}

}
