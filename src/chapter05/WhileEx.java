package chapter05;

public class WhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i =0;
		
		while(sum<10)//<=하면 10에서 안끊긴다 한 15까지 감                                                                                
			//횟수를 알지 못할 때 쓰임, for형과 판별식이 다르다.
		{
			sum+=i;
			System.out.println(i+":"+sum);
			i++;
		}
		
	}

}
