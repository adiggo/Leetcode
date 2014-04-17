public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] diff = new int[gas.length];
        for (int i =0; i<gas.length; ++i){
            diff[i] = gas[i] - cost[i];
        }
        int sum = 0;
        int startNode = 0;
        int leftGas = 0;
        for (int i = 0; i<diff.length; ++i){
            
            sum += diff[i];
            leftGas+= diff[i];
            if (sum<0){
                startNode = i+1;
                sum = 0;
            }

        }
        //we have assumed it is unique
        if (leftGas<0)
            return -1;
        else
            return startNode;
    }
}