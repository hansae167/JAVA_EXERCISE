package chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int data[] = {12,53,24,10,22,38,64,39};
		int max=data[0];
		int min=data[0];
		System.out.print("배열데이터 : ");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
			if(data[i]>max) {
				max=data[i];
			}else if(min>data[i]) {
				min=data[i];
			}//최소 구하는거 헷갈리네 다시해라
			//나는 for문 두번써서 하니씩 비교할려 헀는데 위에게 더 낫다
		}
		System.out.println();
		System.out.println("최대 : "+max);
		System.out.println("최소 : "+min);
	}

}
