
public class SingleNumberTwo{
    public int getUniqueNumber(int[] A){
        int count[32];
        int result = 0;
        for (int i = 0; i < 32; i++){
            for (int j = 0; j < n; j++){
                if ((A[j] >> i) & 1) {
                    count[i]++;
                }
            }
            result |= (count[i] % 3) << i ;
        }
        return result;
    }
}


// and there also a better version which does not need to use the array, more space efficient.
// ones denotes the ithe  only exist once
// twos denotes the ith exist twice
// threes denotes the ith exist threes
int singleNumber(int[] A){
    int ones = 0, twos = 0, threes = 0;
    for (int i = 0; i < n; i++){
        twos |= ones & A[i];
        ones ^= A[i];
        threes = ones & twos;
        ones &= ~threes;
        twos &= ~threes;
    }
    return ones;
}


