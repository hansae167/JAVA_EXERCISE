package chapter09;

public class Doctor {
	private String name;
	private String depart;//department
	
	public Doctor(String name, String depart) {
		this.name = name;
		this.depart = depart;
	}

	public String getName() {
		return name;
	}

	public String getDepart() {
		return depart;
	}
	
	public void treatPatient() {
		System.out.println("환자를 진료함. ");
	}
	
}
