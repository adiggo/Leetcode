/**
 *
 *  Multiply two strings---> best way to do it without using *, is divide each integer into different part  
 *  reverse it use an array to store all the information A[l1 + l2]; use a two for loop, A[i + j] += num1 * num2;
 *
 *
 */



public class Solution {
    public String multiply(String num1, String num2) {
   
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        // even 99 * 99 is < 10000, so maximaly 4 digits
        
        int[] d = new int[num1.length() + num2.length()];
        
        for (int i = 0; i < num1.length(); i++){
            int a = num1.charAt(i) - '0';
            for (int j = 0; j < num2.length(); j++) {
                int b = num2.charAt(j) - '0';  // since it is char in ASCII format, so it should minus '0'.
                d[i + j] += a * b;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d.length; i++) {
            int digit = d[i] % 10;
            int carry = d[i] / 10;
            // insert 
            sb.insert(0, digit);
            
            if (i < d.length - 1)
                d[i + 1] += carry;
        }
        //trim starting zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
