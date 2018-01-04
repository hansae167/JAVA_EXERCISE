package icehs.science.chapter03;

public class StatisticCastingTest {

	public static void main(String[] args) {
		
		double lottoPr = 0.0000001235;//lotto probabillity 로또확률
		long pop = 6973738433L;//population 인구수
		int intLtPr = (int)lottoPr;//int lotto probabillity
		int intPop = (int)pop;//int population
		
	
		System.out.println(lottoPr); 
		System.out.println(intLtPr);
		System.out.println(pop);
		System.out.println(intPop);
	

	}

}
