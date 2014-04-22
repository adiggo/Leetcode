public class LargestRectangle{
    public int largestRectangle(int[] height){
        if (height.length == 0 || height == null){
            return 0;
        }
        if (height.length == 1){
            return height[0];
        }
        Stack<Integer> s = new Stack<Integer>();
        int maxV = 0;
        //rememer to add 0
        //so if the array is ascending
        //the max will be returned
        int[] h = Arrays.copyOf(height, n+1);
        int i = 0;
        while(i<h.length){
            if (!s.empty() && h[s.peek()]>h[i]){
               int tmp =  s.pop();
               maxV = Math.max(maxV, h[tmp] * (s.empty()?i:i-s.peek()-1));
            }else{
                s.push(i);
                i++;
            }
        }
        return maxV;
    }
}

