package chapter08;

public class ArrayDataEx {

	public static void main(String[] args) {
		int lottoNum [] = new int[6];
		String [] names = {"ȫ����","ȫ�浿","ȫ���ΰ�"};
		
		lottoNum[0] = 23;
		lottoNum[1] = 24;
		lottoNum[2] = 25;
		lottoNum[3] = 26;
		lottoNum[4] = 27;
		lottoNum[5] = 28;
		//lottoNum[6] = 1234; 0-5�����ۿ� ���µ�(6��) 6�� ���϶� �ϸ� ������
		
		System.out.println("�迭�� ���� : "+lottoNum.length);//���� ����
		System.out.println("�̸��� ���� : "+names.length);//���� ����(3���ϱ�)
		
		System.out.println(lottoNum[3]);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}

}
