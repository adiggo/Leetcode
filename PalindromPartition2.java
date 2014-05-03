public class PalindromPartition{

    public int minCut(String s){
        int[] result = new int[s.length()+1];
        for (int i= 0; i < result.length; i++)
            result[i] = s.length()- i;
        int[][] dp = new int[s.length()][s.length()];
        //here we define a dp dynamic array to get the where exist palindrom subsequence
        for (int i = s.length()-1; i>=0; i--){
            for(int j = i; j < s.length(); j++){
               if ( (j-i < 2 || dp[i+1][j-1] == true) &&  s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 1;
                    result[i] = Math.min(result[i], result[j]+1);
               }
            }
        }
        return result[0] - 1;
    }
}

    

