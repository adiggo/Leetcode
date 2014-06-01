
public class MaximumSubarray{
    
    public int max(int A[]){
        int max = A[0];
        int[] sum = new int[A.length];

        sum[0] = A[0];
        for (int i = 1; i < A.length; i++){
            sum[i] = Math.max(A[i], sum[i-1]+A[i]); //here is current compare
            max = Math.max(max, sum[i]);// here max denotes the previous max value
        }
        return max;
    }
}
