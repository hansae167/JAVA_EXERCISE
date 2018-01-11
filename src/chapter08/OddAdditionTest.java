package chapter08;

public class OddAdditionTest {

	public static void main(String[] args) {
		int nums[] = {10,21,33,42,51,64,79,80};
		int oddsum =0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2!=0) {
				oddsum+=nums[i];
				System.out.print(nums[i]+" ");
			}else {
				
			}
		}
		System.out.println();
		System.out.println("È¦¼öÀÇ ÇÕ : "+oddsum);

	}

}
