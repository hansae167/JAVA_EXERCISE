package chapter08;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = new int[6];//배열 선언
		arr[0] = 5; //첫번째(0이 첫번째이다. 컴퓨터는 0부터 시작) 참고로 int[6]이지만 arr[0]~arr[5] 까지 5개만 있다.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		for(int i = 0; i < 6; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}
	}

}


























