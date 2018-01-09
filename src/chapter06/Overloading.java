package chapter06;

public class Overloading {
	void add(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	void add(double a, double b) {
		double result = a+b;
		System.out.println(result);
	}
	
	void add(String a, String b) {
		String result = a+b;
		System.out.println(result);
	}
	
	
}
