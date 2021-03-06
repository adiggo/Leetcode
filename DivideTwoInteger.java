/**
 *
 *  Bit Manupulation --> no division, mod, and multiplication operator
 *
 *
 */


public class Solution {
    //idea: use bit
    // find the maximum, and then recursively find submaximum
    public int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 1)  return dividend;
        if (divisor == -1)  return 0-dividend;
    
        long divd = Math.abs((long)dividend), divs = Math.abs((long)divisor);
    
        ArrayList<Long> divisors = new ArrayList<Long>();
        while (divs <= divd) {
            divisors.add(divs);
            divs = divs << 1;
        }
    
        int result = 0, cur = divisors.size() - 1;
        while (divd > 0 && cur >= 0) {
            while (divd >= divisors.get(cur)) { // condition is important since we can't gurantee the remainder is larger than one of divisor.
                                                // divisors are made up of divs * 2.
                divd -= divisors.get(cur);
                result += 1 << cur;   
            }
            --cur;
        }
    
        return (dividend>0)^(divisor>0) ? (-result) : result;
    }
}
