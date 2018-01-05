package chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(sum < 100) {
			sum += i*5;
			System.out.println("+("+(i*5)+")"+sum);
			i++;
		}
	}
//sum의 값이 100이하일때 계속하라..
//sum의 값이 나중에 103으로 넘어버릴 때 그떈 중단함 순서를 바꿔서 수정할수 있다
}
