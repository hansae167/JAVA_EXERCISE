package chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int total = 0;//����
		int mem = 0;//membernumber
		System.out.print("������ �������� ����? : ");
		int time =  getUserInput();//������ ���������� ��
		System.out.println("==================");
		for(int i=1;  i<=time; i++) {
			System.out.print(i+"����� : ");
			total+=getUserInput();
		}
		System.out.println("�� ����� "+total+"�� �Դϴ�.");
		
		System.out.println("==================");
		System.out.print("������ �ο����� �Է��ϼ���. : ");
		mem =getUserInput();
		int avg;//���
		avg = total/mem;
		
		System.out.println("==================");
		System.out.println("��ġ���� �ݾ���?");//�������� �ݾ���?
		for(int i=1; i<=mem; i++) {
			if(i!=mem) {
				total-=avg;//��ü���� ������ ��
				System.out.println(i+":"+avg+"��");//��հ���
			}else if (i==mem)//����������� 
			{
			System.out.println(i+":"+total+"��");//�ٻ��� ���������� ����(�׷��ϱ� ������ ���� �������� �߰��� ���� �Ҹ�)
			}
		}
		
	}
//���, �ٽú����ϼ�
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;

	}

}
