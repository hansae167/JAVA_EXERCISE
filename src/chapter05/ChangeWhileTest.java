package chapter05;

public class ChangeWhileTest {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			int j=1;//위에서 j의 초기값을 설정하면 아래에서의 j는 계속 커져만가기때문에 별이 한개씩만 만들어져서, 위에 while문이 돌아갈때마다 초기값을 설정하게 해야한다.
			while(j<=i) {
				System.out.print("*");
				j++;
				
			}
		System.out.println();
			i++;
		}
	//참고로 for는 초기값이 안에 정하게 되있어 이런문제 없다
	}

}
