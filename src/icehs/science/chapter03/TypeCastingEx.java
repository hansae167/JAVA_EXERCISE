package icehs.science.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		long billWth = 7000000000L; //bill wealth�� ����
		System.out.println("Original Value : " +billWth);
		
		double dbBillWth = billWth; //double bill wealth�� ����
		System.out.println("double�� ��ȯ : " +dbBillWth);//double���̴� ���� x
		
		int intBillWth = (int)billWth; //int������ ��ȯ
		System.out.println("int������ ���� ��ȯ : " +intBillWth);//int �����δ� ��� ������ ����. casting�ǹ���
	}

}
