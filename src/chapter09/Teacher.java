package chapter09;

public class Teacher extends Person {
	private String sub;//subject
	
	public Teacher(String name, String phone, String sub) {
		super(name,phone);
		this.sub = sub;
	}
	@Override//오버라이드 한 메서드임을 알림, 그래서 실수해서 데이터 타입 바꿔어도 다른 메서드로 인식하는게 아니라 오류를 띄워 바꾸게 해준다.
	public void eat() {
		super.eat();
		System.out.println("함꼐밥을 먹다");
	}
	//부모 클래스의 내용을 가져와 필요하에 의해 일부를 바꿈(재정의함= 메소드 오버라이딩) 이렇게 다시 써서 내용을 바꿔놓는다.  여기에서만.
	//메서드는  데이터 타입이랑ㅇ 파라미터등이 똑같아야 한다(기본 오버라이딩과 다름)
	//그렇다고 완전 바꾸는건 아니고 부모것을 다시 쓸수 있다. 위에얹은거라 보자
	public void teach() {
		System.out.println("가르치다.");
		
	}
}
