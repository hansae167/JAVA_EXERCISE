package chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		System.out.print("�����Է� : ");
		int num = getUserInput();
		int wat =0;
		int yee;
		for(int i=2; i<num; i++) {
			wat=num%i;
			if(wat!=0) {
				yee = 1;
				continue;
			}else if(wat==0){
				System.out.println("�Ҽ��� �ƴմϴ�.");
				yee = 0;
				break;
			}
		}//���� ������ �ʿ�
	}
	
	

public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;

	}//�����ʿ�
}
