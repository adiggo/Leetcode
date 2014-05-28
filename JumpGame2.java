public class JumpGame2{
    public int jump(int[] A){
        int start = 0;
        int end = 0;
        int count = 0;
        if (A.length==1) return 0;
        while(end<n)
        {
            int max = 0;
            count++;
            for (int i= start; i<=end; i++)
            {
                if (A[i]+i>n-1)
                    return count;
                if (A[i]+i>max) // for each jump, need to find out its maximum   O(N^2)
                    max = A[i]+i;
            }
            start = end+1;
            end = max;
        }
    }
}
