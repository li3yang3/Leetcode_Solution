package assignment3;

public class countDigits {
	     public int countDigits(int n) {
	    	  int count = 1;
	    	  int divide = n;
		      while(divide >= 10) {
		    	  divide = divide/10;
		    	  count++;
		      }
		      int res = n%count;
		      System.out.println(res);
		      return res;
	}

		 public static void main(String args[]) {
			    countDigits test = new countDigits();
		    	test.countDigits(140);
		  }
}
