package chapter05;

public class WhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i =0;
		
		while(sum<10)//<=�ϸ� 10���� �Ȳ���� �� 15���� ��                                                                                
			//Ƚ���� ���� ���� �� ����, for���� �Ǻ����� �ٸ���.
		{
			sum+=i;
			System.out.println(i+":"+sum);
			i++;
		}
		
	}

}
