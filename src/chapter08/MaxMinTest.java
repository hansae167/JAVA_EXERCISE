package chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int data[] = {12,53,24,10,22,38,64,39};
		int max=data[0];
		int min=data[0];
		System.out.print("�迭������ : ");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
			if(data[i]>max) {
				max=data[i];
			}else if(min>data[i]) {
				min=data[i];
			}//�ּ� ���ϴ°� �򰥸��� �ٽ��ض�
			//���� for�� �ι��Ἥ �ϴϾ� ���ҷ� ���µ� ������ �� ����
		}
		System.out.println();
		System.out.println("�ִ� : "+max);
		System.out.println("�ּ� : "+min);
	}

}
