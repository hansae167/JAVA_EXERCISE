package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name ="홍성기";
		String mathSc = "95";//문자열,로서의 숫자이다
		int intMathSc = Integer.parseInt(mathSc); //문자열인mathSc를 int형으로 변환, 생각보다 복잡하다.
		int engSc = 82;//얘는 계산가능
		
		System.out.println("이름:"+name);
		System.out.println("수학점수:"+mathSc);
		System.out.println("영어점수:"+engSc);
		//되도록 간격 띄우는게 좋다
		System.out.println("합계점수:"+ intMathSc+engSc);//+문자열+숫자, 계산은 안된다
		//출력 값은 그냥이어져서 나온다
		//참고로 int로 바꿔도 안된다
		System.out.println("합계점수:"+ (intMathSc+engSc));
		//이렇게 괄호로 묶어두자
		System.out.println("합계점수:" + (intMathSc+engSc) + "점");
		//이렇게도 가능 (걍 괄호먼저 한다 생각, 시작이 문자열이면 다 문자열로 인식하니 저 괄호 먼저(숫자) 계산한다 생각하자
		
	}

}
