package chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int score = 75;
		
		boolean res1 = (score <= 100) && (score >= 90); //result1 괄호는 쳐놓으면 보기쉽다.
		System.out.println("A학점 : " +res1);
		
		boolean res2 = (score < 90) && (score >= 80); //result2 
		System.out.println("B학점 : " +res2);
		
		boolean res3 = (score < 80) && (score >= 70); //result3
		System.out.println("C학점 : " +res3);
		
		boolean res4 = (score < 70) && (score >= 60); //result4
		//앞에것이 부정으로 끝나면 뒤에건 아예 보지 않는다 &&이니까
		System.out.println("D학점 : " +res4);

	}

}
