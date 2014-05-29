public class SingleNumber2{
    public int singleNumber(int[] A){
        int[] counts = new int[32];
        int result = 0;
        for (int i = 0; i < 32; i++){
            for (int j = 0; j < A.length; j++){
                if (((A[j] >> i) & 1) == 1){
                    counts[i] = (counts[i] + 1) % 3;// count record the number of 1
                }
            }
            result |= (counts[i] << i); // back to the index
        }
        return result;
    }
}
