public class Solution {
    public int longestConsecutive(int[] a) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i: a){
            set.add(i);
        }
        
        int max = 1;
        for (int num:a){
            int left = num-1;
            int right = num+1;
            int count = 1;
            
            while(set.contains(left)){
                
                count++;
                set.remove(left);
                left--;
            }
            
            while(set.contains(right)){
                count++;
                set.remove(right);
                right++;
            }
            
            max = Math.max(max, count);
            
        }
        
        return max;
    }   
        
}
