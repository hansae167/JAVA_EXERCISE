package chapter08;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = new int[6];//�迭 ����
		arr[0] = 5; //ù��°(0�� ù��°�̴�. ��ǻ�ʹ� 0���� ����) ����� int[6]������ arr[0]~arr[5] ���� 5���� �ִ�.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		for(int i = 0; i < 6; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}
	}

}


























