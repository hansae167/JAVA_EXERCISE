package chapter08;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		String str6 = str2;
		if(str1==str2) {
			System.out.println("두 객체는 같습니다");
		}//java는 같다고 판단  str2가 새로운 abc를 가지는게 아닌 그냥 str1에 있는 abc에 화살표가 간다고 생각
		
		if(str3==str4) {
			System.out.println("두 객체는 같습니다");
		}else {
			System.out.println("두 객체는 다릅니다");
		}// 이 두 객체는 서로 다르게 판단한다
		
		if(str1==str3) {
			System.out.println("두 객체는 같습니다");
		}else {
			System.out.println("두 객체는 다릅니다");
		}//얘도 다름
		
		if(str1.equals(str3)) {
			System.out.println("글자가 같습니다");
		}else {
			System.out.println("글자가 다릅니다");

		}//객체가 아닌 문자를 비교하는 .equals() 를 사용(문자니 String 에 쓰임)
	}
}
