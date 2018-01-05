package chapter05;

public class GuGuDanTest {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) //2단부터 하니까
		{
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));//ln없으면 쭉 이어져 나오는 것을 이용해도 좋다
			}
			System.out.println();//ln있으니 걍 한칸내려주는 역할
		}//(\t)같은건 탭으로 띄워주는 놈

	}

}
