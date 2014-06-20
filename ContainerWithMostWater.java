/**
 *
 *
 * Scan once from start to end
 *
 *
 */

public class ContainerWithMostWater{

    public int maxArea(int[] input){
        int low = 0, high = input.length - 1, maxValue = 0;

        while (low < high){
            int tempResult = (high - low) * Math.min(input[high], input[low]);
            maxValue = Math.max(maxValue, tempResult);
            if (input[high] > input[low])
                low++;
            else
                high--;
        }
        return maxValue;
    }
}

            
