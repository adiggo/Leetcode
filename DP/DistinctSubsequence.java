public class DistinctSubsequence{
    public int numDistinct (String s, String t){
        // why we need to build such length+1 array
        // because our current number decieded by
        // before number
        int[][] result = new int[s.length()+1][t.length()+1];

        for (int i = 0; i < s.length(); i++){
            result[i][0] = 1;
        }


        for (int i = 1; i < s.length()+1; i++){
            for (int j = 1; j < t.length()+1; j++){
                if (s.charAt(i) == t.charAt(j))
                    result[i][j] = result[i-1][j] + result[i-1][j-1];
                else
                    result[i][j] = result[i-1][j];

            }
        }
        return result[s.length()+1][t.length()+1];
    }
}
