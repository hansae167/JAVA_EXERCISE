package chapter08;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		String str6 = str2;
		if(str1==str2) {
			System.out.println("�� ��ü�� �����ϴ�");
		}//java�� ���ٰ� �Ǵ�  str2�� ���ο� abc�� �����°� �ƴ� �׳� str1�� �ִ� abc�� ȭ��ǥ�� ���ٰ� ����
		
		if(str3==str4) {
			System.out.println("�� ��ü�� �����ϴ�");
		}else {
			System.out.println("�� ��ü�� �ٸ��ϴ�");
		}// �� �� ��ü�� ���� �ٸ��� �Ǵ��Ѵ�
		
		if(str1==str3) {
			System.out.println("�� ��ü�� �����ϴ�");
		}else {
			System.out.println("�� ��ü�� �ٸ��ϴ�");
		}//�굵 �ٸ�
		
		if(str1.equals(str3)) {
			System.out.println("���ڰ� �����ϴ�");
		}else {
			System.out.println("���ڰ� �ٸ��ϴ�");

		}//��ü�� �ƴ� ���ڸ� ���ϴ� .equals() �� ���(���ڴ� String �� ����)
	}
}
