package assignment3;

import java.util.ArrayList;

public class solution {
	 public String reverseWords(String s) {
	        char res[] = s.toCharArray();
	        int len = res.length;
	        ArrayList<String> arr = new ArrayList<String>();
	        String ans = "";
	        String result = "";
	        for( int i = 0; i < len; i++) {
	            if(res[i] != ' ') {
	                ans += res[i];
	                if( i == len - 1 || res[i+1] == ' ') {
	                    arr.add(ans);
	                    ans = "";
	                    continue;
	                }
	                
	            }
	        }
	        for(int j = arr.size() - 1; j >= 0; j--) {
	              result += arr.get(j);
	              if(j == 0){
	                  break;
	              }
	              result += " ";
	             
	              
	        }
	        System.out.println(result+"");
	        return result;
	    }
	 
	 public static void main(String args[]) {
		 solution test = new solution();
	    	test.reverseWords("HI!");
	    }
}
