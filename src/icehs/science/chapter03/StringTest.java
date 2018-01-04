package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String king = "세에종대왕";
		String won = "10000";
		int thisYear = 2018;
		int intWon = Integer.parseInt(won); 
		
		System.out.println(king + ":" + won);//익숙해져야한다
		System.out.println(thisYear + "년");
		System.out.println(won + thisYear);
		System.out.println(thisYear + won);
		System.out.println(thisYear + intWon);//C와다르게 표현이 ㅅㅟㅂ다
		

	}

}
