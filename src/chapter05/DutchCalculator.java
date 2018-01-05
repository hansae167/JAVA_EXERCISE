package chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int total = 0;//총합
		int mem = 0;//membernumber
		System.out.print("모임은 몇차까지 진행? : ");
		int time =  getUserInput();//모임의 몇차에서의 차
		System.out.println("==================");
		for(int i=1;  i<=time; i++) {
			System.out.print(i+"차비용 : ");
			total+=getUserInput();
		}
		System.out.println("총 비용은 "+total+"원 입니다.");
		
		System.out.println("==================");
		System.out.print("모임의 인원수를 입력하세요. : ");
		mem =getUserInput();
		int avg;//평균
		avg = total/mem;
		
		System.out.println("==================");
		System.out.println("더치페이 금액은?");//나눠내는 금액은?
		for(int i=1; i<=mem; i++) {
			if(i!=mem) {
				total-=avg;//전체에다 나머지 뺌
				System.out.println(i+":"+avg+"원");//평균가격
			}else if (i==mem)//마지막사람은 
			{
			System.out.println(i+":"+total+"원");//다빼고 남은가격을 낸다(그러니까 나누고도 남는 나머지를 추가로 낸단 소리)
			}
		}
		
	}
//어렵, 다시복습하셈
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;

	}

}
