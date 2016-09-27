package assignment3;

public class printNumbers {
	public void printNumbers(int n) {
		
	if(n < 0) {
		return;
	}
    if(n%2 == 0) {
    	for(int i = 0; i < 2*n; i = i + 2) {
    		System.out.println(i);
    		
    	}
    }
    else {
    	for(int i = 1; i < 2*n; i = i + 2) {
    		System.out.println(i);
    		
    	}
    }
 
	}
	
	 public static void main(String args[]) {
		 printNumbers test = new printNumbers();
	    	test.printNumbers(3891);
	    }

}
