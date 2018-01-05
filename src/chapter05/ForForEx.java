package chapter05;

public class ForForEx {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));//ln없으면 쭉 이어져 나오는 것을 이용해도 좋다
			}
			System.out.println();//ln있으니 걍 한칸내려주는 역할
		}
		//보통 for안에서의 변수, 밖에서 쓰이지않고 그저 횟수를 세는 용도로만 쓰인다면 0부터 시작하는것을 추천한다.(쌤) 곱셉같은경우 곱셉에 쓰이니 1부터 해야한다
		//5번 쓸때 i=0; i<5;로(횟수로만)
		}

}
