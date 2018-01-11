package chapter08;

public class Student {
	private String name;
	private String id;
	private String phoneNum;
	
	public Student(String name, String id, String phoneNum) {
		this.name = name;
		this.id = id;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
