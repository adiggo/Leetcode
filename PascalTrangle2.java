/**
 *
 * PascalTriangle 2 requires us to get the specific row, since we
 * can get the result of PascalTriangle by get the ArrayList,
 * however, it is not a good method for this problem since it takes too
 * much space. So in this problem we need to use a array which can holds more elements,
 * and update each time. Initial set result[0]=1, than update it each time with the for
 * loop.
 */


public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int []res = new int[rowIndex+1];
        res[0]=1;
        if(rowIndex==0) return getList(res);
        for(int j=1;j<rowIndex+1;j++){
            for(int i=j-1;i>0;i--){
                // written previous res[]
                res[i]=res[i]+res[i-1];
            }
            res[j]=1;
        }
        return getList(res);
    }
    
    public ArrayList<Integer> getList(int[] nums){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
        return res;
    }
}
