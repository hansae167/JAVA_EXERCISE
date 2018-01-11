package chapter09;

public class DoctorTest {

	public static void main(String[] args) {
		Dentist dent = new Dentist("±ËEH»Ò");
		System.out.println(dent.getDepart()+":"+dent.getName());
		dent.treatPatient();
		dent.pullOutTooth();
		
	}

}
