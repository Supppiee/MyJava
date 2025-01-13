package Programming.Arrays;

public class findFirstAndLastOccurance {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,3,6,5,2,6,5,2,9};
	      int first = -1;
	      int last = -1;
	      int target = 2;
	      for(int i=0; i<arr.length; i++){
	        if(arr[i] == target){
	            if(first == -1){
	              first = i;
	            } 
	          last = i;
	        }
	      }
	      System.out.println("First occurance :"+first);
	      System.out.println("last occurance :"+last);
	}
}
