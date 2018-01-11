package chapter08;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		int nums[] = {11,22,33,44,55,66,77,88,99};
		int sum = 0;
		
		System.out.println("배열의 내용 : ");
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.print(nums[i]+" ");
		}//아래걸 걍 위에 for랑 같이 합쳐 간단히 함
		
		/*
		System.out.println("배열의 내용 : ");
		for(int i=0; i <nums.length; i++) {
			System.out.print(nums[i]+" ");//저 num.length가 총 길이를 수로 만드니 이렇게 이용할 수 있음.
		}
		*/
		System.out.println();
		System.out.println("합계 : "+sum);

	}

}
