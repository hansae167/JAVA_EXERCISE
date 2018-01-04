package chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monSal =1000000; //monthSalary
		int bonus = monSal * 20/100 * 4;
		int yearSal = monSal * 12 + bonus;
		int bonusTax = bonus * 55 /1000;
		int yearSalTax = monSal * 12 * 10/100;//??
		int totalSal = yearSal + bonus - bonusTax - yearSalTax;
		//double형을 안한 이유는 뒤에 .0그게 거슬려서
		
		System.out.println("연봉:" +yearSal + ",세후연봉:" +(yearSal-yearSalTax));
		System.out.println("보너스:" +bonus+",세후보너스:" +(bonus-bonusTax));
		System.out.println("지급액:" +totalSal);
	}

}
