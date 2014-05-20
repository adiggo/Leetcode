/**
 *
 *  Use binary search to solve this problem. 
 *
 *  @author Xiaoping Li
 */


public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n==0) return 1.; // be careful of the return type
        if(x==0) return 0.; 
        if(n<0){
            n=-n;
            x=1./x;
        }
        
        double res=1.;
        while(n>0){
            if(n%2 == 1) res*=x;
            x*=x;
            n>>=1;
        }
        return res;
    }
}
