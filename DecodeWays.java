/**
 *
 *
 * dynamic programming----> use an array to store all the information
 * since for the character, the maximum integer to denote is 26. So we need to 
 * consider two situations: substring(i-2,i) <=26 or >26, but need to make sure "0" into consideration
 * since for "ABCD*****", no char denotes "0". So only "0" digit is a invalid input. Also consider 300, 
 * for the latter two digit "00", no char can be represented. Only range between "1-26" can be represented.
 *
 */

public class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0) {
            return 0;
         }
    //special condition
        if(s.charAt(0)=='0') {
            return 0;
        }
        
        int [] number = new int[s.length() + 1];
        number[0] = 1;
        number[1] = 1;
        int tmp;
        for(int i=2;i<=s.length();i++) {
           
            tmp = Integer.parseInt(s.substring(i-1,i));
            if(tmp!=0) { 
                // number[i] = number[i-1]
                 number[i] = number[i-1];
            }
            
            if(s.charAt(i-2)!='0') {
                tmp = Integer.parseInt(s.substring(i-2,i));
                if(tmp>0&&tmp<=26) {
                    number[i] += number[i-2];
                }
            }
        }
        return number[s.length()];
    }
}
