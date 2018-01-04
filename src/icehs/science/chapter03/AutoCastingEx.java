package icehs.science.chapter03;

public class AutoCastingEx {

	public static void main(String[] args) {
		int number = 1000;
		double  num = 1000L;
		long lgnum = number;
		double dbnum = lgnum;
		// 더 큰 수를(double) 담는 변수에 그것보다 작은(int) 변수를 넣어도 문제가 없다(double>int)
		double nuum = 1000000000012300.25;
		long hgnum = (long)nuum;//long 형으로 변환
		int smnum = (int)hgnum;//int 형으로 변환 
		//이런경우 에러가 뜨거나(형변환 안하면) 강제 형변환(casting)이라는 것으로 데이터 길이를 잘라서 표현한다
		//예시1
		System.out.println(number);
		System.out.println(lgnum);
		System.out.println(dbnum);
		System.out.println(num);
		//예시2
		System.out.println(hgnum);
		System.out.println(smnum);
		//여기서 보면 int(smnum)부분의 앞부분이 짤려있다.(또는 뒷부분) 
		//E17 10의 17승=10이 17개 있다...
	}

}
