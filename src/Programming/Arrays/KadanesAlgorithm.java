package Programming.Arrays;

public class KadanesAlgorithm {
	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int max_sum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum < 0) {
				sum = 0;
			}
			if(sum > max_sum) {
				max_sum = sum;
			}
		}
		System.out.println("Max Subarray Sum : "+max_sum);
	}
}
