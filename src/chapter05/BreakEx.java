package chapter05;

public class BreakEx {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++)
		{
			for(int j=1; j<=9; j++) {
				if(j==7) {
					continue;//break �ϸ� �ٷ� �������� �ڿ� �۾����� �� �������� continue�� �׳� ��ŵ�ϴ°Ŷ� �� �۾��� ���ϴ� ���̴�.(??�Ƹ�)
				}else 
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
	}

	}
}