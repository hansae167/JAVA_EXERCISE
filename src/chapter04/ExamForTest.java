package chapter04;

public class ExamForTest {

	public static void main(String[] args) {
		int sum = 0;
		int arr[] = {11,22,33,44,55,66,77};
		for(int i = 5; i < 5; i++) {
			sum+=i;
		}//5부터 5 전까지?
		//for문은 조건을 만족할때까지 계속 도는 거라 생각하자
		System.out.println(sum);
		for(int i = 5; i <= arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
