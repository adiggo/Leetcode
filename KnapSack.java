public class KnapSack{
    // record state from 1 to S
    // and each 
 public int knspsack(int s, int[] A){
    int[] min = new min[S+1]; 
    min[0] = 0;
    //other than min[0], equal to infinity
    for i 1 to s
        for j 0 to N-1
            if (A[j]<= i and min[i- A[j]] + 1 < min[i]) // here +1 means in i state, the number of coins if include A[j].---> operation on state
                min[i] = min[i - A[j]] + 1
    return min[s];
 }
}
