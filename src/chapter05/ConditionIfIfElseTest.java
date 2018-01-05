package chapter05;

public class ConditionIfIfElseTest {

	public static void main(String[] args) {
		int age =20;
		if(age >= 19) {
			System.out.println("성인입니다");
			System.out.println("입장하세요");
		}else if(age >=14) {
			System.out.println("청소년입니다");
			System.out.println("입장하세요");
		}else {
			System.out.println("어린이입니다");
			System.out.println("77ㅓ져");
		}
	}

}
