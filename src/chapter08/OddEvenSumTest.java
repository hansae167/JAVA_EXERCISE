package chapter08;

public class OddEvenSumTest {

	public static void main(String[] args) {
		int [] arr = {12,53,24,10,22,38,64,39};
		int oddSum=0;
		int evenSum=0;
		
		System.out.print("�迭������ : ");
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				oddSum +=arr[i];
			}else {
				evenSum +=arr[i];
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Ȧ����° �� :"+oddSum);
		System.out.println("¦����° �� :"+evenSum);
		}

}
