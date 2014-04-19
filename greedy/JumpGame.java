public class Solution {
    public int jump(int[] A) {     
        int curMax = 0; int nextMax = 0; int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (i > curMax) {
                curMax = nextMax;
                ans++;
            }
            nextMax = Math.max(nextMax,A[i] + i);
        }
        return ans;
    }

}