package chapter08;

public class ArrayDataEx {

	public static void main(String[] args) {
		int lottoNum [] = new int[6];
		String [] names = {"홍은기","홍길동","홍익인간"};
		
		lottoNum[0] = 23;
		lottoNum[1] = 24;
		lottoNum[2] = 25;
		lottoNum[3] = 26;
		lottoNum[4] = 27;
		lottoNum[5] = 28;
		//lottoNum[6] = 1234; 0-5까지밖에 없는데(6개) 6을 구하라 하면 오류뜸
		
		System.out.println("배열의 길이 : "+lottoNum.length);//길이 구함
		System.out.println("이름의 길이 : "+names.length);//길이 구함(3개니까)
		
		System.out.println(lottoNum[3]);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}

}
