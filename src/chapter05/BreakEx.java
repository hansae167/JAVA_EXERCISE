package chapter05;

public class BreakEx {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++)
		{
			for(int j=1; j<=9; j++) {
				if(j==7) {
					continue;//break 하면 바로 빠져나가 뒤에 작없까지 다 안하지만 continue는 그냥 스킵하는거라 그 작업만 안하는 것이다.(??아마)
				}else 
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
	}

	}
}