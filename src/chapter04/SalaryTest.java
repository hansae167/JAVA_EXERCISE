package chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monSal =1000000; //monthSalary
		int bonus = monSal * 20/100 * 4;
		int yearSal = monSal * 12 + bonus;
		int bonusTax = bonus * 55 /1000;
		int yearSalTax = monSal * 12 * 10/100;//??
		int totalSal = yearSal + bonus - bonusTax - yearSalTax;
		//double���� ���� ������ �ڿ� .0�װ� �Ž�����
		
		System.out.println("����:" +yearSal + ",���Ŀ���:" +(yearSal-yearSalTax));
		System.out.println("���ʽ�:" +bonus+",���ĺ��ʽ�:" +(bonus-bonusTax));
		System.out.println("���޾�:" +totalSal);
	}

}
