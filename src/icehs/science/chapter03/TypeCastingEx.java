package icehs.science.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		long billWth = 7000000000L; //bill wealth의 줄임
		System.out.println("Original Value : " +billWth);
		
		double dbBillWth = billWth; //double bill wealth의 줄임
		System.out.println("double형 변환 : " +dbBillWth);//double형이니 문제 x
		
		int intBillWth = (int)billWth; //int형으로 변환
		System.out.println("int형으로 강제 변환 : " +intBillWth);//int 형으로는 모두 담을수 없다. casting되버림
	}

}
