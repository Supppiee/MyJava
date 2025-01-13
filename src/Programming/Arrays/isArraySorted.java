package Programming.Arrays;

public class isArraySorted {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
	      Boolean isSorted = true;
	      for(int i=0; i<arr.length-1; i++){
	        if(arr[i] > arr[i+1]){
	          isSorted = false;
	        }
	      }
	      System.out.print((isSorted)? "sorted" : "Not sorted");
	}
}
