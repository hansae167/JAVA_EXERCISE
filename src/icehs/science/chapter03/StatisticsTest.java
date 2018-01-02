package icehs.science.chapter03;

public class StatisticsTest {

	public static void main(String[] args) {
		int distance = 150000000;
		double lottoPr = 0.0000001235;
		long pop = 6973738433L;
		boolean isRight = true;
		
		System.out.println("태양에서 지구까지의 거리:"+distance);
		System.out.println("로또에 당첨될 확률 :" +lottoPr);
		System.out.println("전 세계의 인구수: "+ pop);
		System.out.println("위의 값들이 정확한가요? : " + isRight);
//:간 띄어쓰기 간격을 달리함. 차이점을 비교해 보자 
//참고로 뒤에 +간 간격은 영향을 주지 않음을 알 수 있다.
	}

}
