public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(nums.length, Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++){
            heap.offer(nums[i]);
        }
        
        // polling out the first kth element
        
        for (int i = 1; i <=k; i++){
            if (i == k){
                return heap.poll();
            }
            heap.poll();
        }
        return 0;
    }
}
