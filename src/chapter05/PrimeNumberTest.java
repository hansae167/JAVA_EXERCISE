package chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		System.out.print("숫자입력 : ");
		int num = getUserInput();
		int wat =0;
		int yee;
		for(int i=2; i<num; i++) {
			wat=num%i;
			if(wat!=0) {
				yee = 1;
				continue;
			}else if(wat==0){
				System.out.println("소수가 아닙니다.");
				yee = 0;
				break;
			}
		}//여기 수정이 필요
	}
	
	

public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;

	}//수정필요
}
