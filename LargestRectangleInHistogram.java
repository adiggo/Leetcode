import java.util.*;
public class LargestRectangleInHistogram{
    public int maximumArea(int[] height){
        if (height == null || height.length() ==0){
            return 0;
        }
        if (height.length() == 1){
            return 0;
        }
        
        int maxArea = 0;
        for (int i = 0; i < height.length; i++){
            int minV = height[i];
            for (int j = i; j>= 0; j--){
                minV = Math.min(minV, height[j]);
                // be careful, need to add 1
                int area = minV*(i-j+1);
                if (area > maxArea)
                    maxArea = area;
            }
        }
        return maxArea;
    }
}



