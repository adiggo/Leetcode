/**
 *
 *Solution method provides the way to get the minimum elements to get the sum from root to leaf
 *in a triangle.Start from bottom, get all the element from bottom, select the minimum in the bottom, then go up with the corresponding value.
 *greedy method to get the sub-optimal
 *
 *
 *
 */


public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
       // placeholder to hold all the elements in total array 
        int[] total = new int[triangle.size()];
        int l = triangle.size() - 1;
     
        for (int i = 0; i < triangle.get(l).size(); i++) {
            total[i] = triangle.get(l).get(i);
        }
     
        // iterate from last second row
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
                // From bottom to up
                // overwrite total[j], since the last row only contains one element, so we just need to output total[0]
                total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
            }
        }
     
        return total[0];
    }
}
