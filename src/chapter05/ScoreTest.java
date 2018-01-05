package chapter05;

import java.util.Scanner;

public class ScoreTest {

        
    public static void main(String[] args) {
    	int stunum;//student number
    	int sumSc = 0;//sum score
    	double avgSc = 0.0;//?
    	
    	System.out.print("학생 수? : ");
    	int a = getUserInput();
    	
    	
    	for(int i=1; i<=a; i++) {
    	System.out.print(i+"번 점수 : ");
    	stunum = getUserInput();
    	sumSc+=stunum;//그냥 sumSc+=getUserInput() 을 하는게 위에꺼도 생략하고 더 좋다
    	}
    	avgSc = (double)sumSc/a;
    	System.out.println(sumSc);
    	System.out.println(avgSc);
    	
	}
    
    
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;

	}
}