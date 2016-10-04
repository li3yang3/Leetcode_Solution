Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

  /*
解题困局：1.不清楚应该加入哪些罗马字符
2.罗马数字的左减右加原则，如何在遍历数组的时候正确体现，初步认为应该两两字符比较大小，然后进行加减运算，但正向遍历会出现XCIX这种情况，100-10+1-10=81
 而XCIX应该为99
 
解题思路：1.将不重复且不可以经过其他字符累加得到的罗马字符加入hashmap
2.逆向遍历，两两字符进行比较，当前字符小于上一个字符则减，当前字符大于上一个字符则加
3.可以直接用字符串的.charAt()直接从字符串中取字符，不需要转换成charArray.
*/

public class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() ==0)
        return 0;
        
       HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
       hm.put('I',1);
       hm.put('V',5);
       hm.put('X',10);
       hm.put('L',50);
       hm.put('C',100);
       hm.put('D',500);
       hm.put('M',1000);
       
       char[] res = s.toCharArray();
       int len = res.length;
       int result = hm.get(res[len-1]);
       for(int i = len - 2; i >= 0;i--) {
           if(hm.get(res[i]) < hm.get(res[i+1])) {
               result -= hm.get(res[i]);
           }
           else{
               result += hm.get(res[i]);
           }
       }
       return result;
       
       
    }
}
