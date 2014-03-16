public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int res = 0;
        if(A.length<3) return res;
        int[] left = new int[A.length-2],
              right = new int[A.length-2];
        for(int i=0;i<A.length-2;i++)
            left[i]=i>0?Math.max(left[i-1],A[i]):A[i];
        for(int i=A.length-3;i>=0;i--)
            right[i]=i<A.length-3?Math.max(right[i+1],A[i+2]):A[i+2];
        for(int i=0;i<A.length-2;i++){
            int temp = Math.min(left[i],right[i]);
            if(temp>A[i+1])
                res+=temp-A[i+1];
        }
        
        return res;
    }
}