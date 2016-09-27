package assignment3;


public class assignment3 {

	 /* Write a method to find N numbers which are power of three. e.g. n=4,
			 * return {1,3,9,27}
			 */
	
	public int[] findPowerOfThree(int n) {
		if (n < 1) {
			return null;
		}
        int number = 3; 
		int arr[] = new int[n];
		arr[0] = 1;
		  for(int i = 1; i < n; i++) {
			  arr[i] = arr[i-1] * number;
		  }
	     
		  return arr;
	}
	
	 public static void main(String args[]) {
	    	assignment3 test = new assignment3();
	    	test.findPowerOfThree(-3);
	    }
}
