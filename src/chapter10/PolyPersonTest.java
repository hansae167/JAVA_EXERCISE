package chapter10;

public class PolyPersonTest {

	public static void main(String[] args) {
		/*
		Person p1 = new Person();
		
		Student s1 = new Student("홍익인간","123","역사학과");
		Teacher t1 = new Teacher("김치전우치","12345","요리학과");
		//이렇게도 하지만
		
		Person s1 = new Student("홍익인간","123","역사학과");
		Person t1 = new Teacher("김치전우치","12345","요리학과");
		//이렇게 해도 된다
		//그렇게 하면*
		 * 
		*/
		
		Person[] p1 = {new Person(), new Student("홍익인간","123","역사학과"), new Teacher("김치전우치","12345","요리학과")};
		//*이렇게 배열로 묶을 수 있다는 장점이 있다.
		
		/*
				p1.sleep();
				s1.sleep();
				t1.sleep();
				//여기도 이렇게 하지말고*
		 */
		//*아래같이 바꿔야 한다
		//여기서	p1[1].study(); 는 Person의 객체이기 때문에 이것은 사용할수 없다
		//((Student)student).study(); 같은 꼴로 캐스팅을 해서 이 문제를 해결 할수 있다
		p1[0].sleep();
		p1[1].sleep();
		p1[2].sleep();
		((Student)p1[1]).study();//이거 같이
		//((Teacher)p1[1]).teach();//이거 같이하면 오류가 뜬다 p1[1]은 student인데
		
		
		p1[0].eat();
		p1[1].eat();
		p1[2].eat();//각 다 오버라이딩 함
		
		//부모의 것을 호출하는게 아니라 (할거면 super.eat();을 쓴다)
		//각각 자식의 것이 호출되는것이다 (상속된거 이용한거지만)
		
		if(p1[1] instanceof Student) {//p1[1]이 만약 Student의 인스턴스라면(객체),
			Student s = (Student)p1[1]; //이걸로 바꿔라
			s.study();
		}else if(p1[1] instanceof Teacher) {
				Teacher t =(Teacher)p1[1];
				t.teach();
		}//이걸 응용하면 for문으로 더 쉽게 나타낼 수 있다.
		
	
	}

}
