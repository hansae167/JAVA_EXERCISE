package icehs.science.chapter03;

public class AutoCastingEx {

	public static void main(String[] args) {
		int number = 1000;
		double  num = 1000L;
		long lgnum = number;
		double dbnum = lgnum;
		// �� ū ����(double) ��� ������ �װͺ��� ����(int) ������ �־ ������ ����(double>int)
		double nuum = 1000000000012300.25;
		long hgnum = (long)nuum;//long ������ ��ȯ
		int smnum = (int)hgnum;//int ������ ��ȯ 
		//�̷���� ������ �߰ų�(����ȯ ���ϸ�) ���� ����ȯ(casting)�̶�� ������ ������ ���̸� �߶� ǥ���Ѵ�
		//����1
		System.out.println(number);
		System.out.println(lgnum);
		System.out.println(dbnum);
		System.out.println(num);
		//����2
		System.out.println(hgnum);
		System.out.println(smnum);
		//���⼭ ���� int(smnum)�κ��� �պκ��� ©���ִ�.(�Ǵ� �޺κ�) 
		//E17 10�� 17��=10�� 17�� �ִ�...
	}

}
