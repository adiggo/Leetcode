/**
 *
 *Interleaving String need to be solved by dynamic programming;
 *Build a form----> record[s1.length()+1][s2.length()+1]
 *init record[0][0] = true
 *
 */
public class InterleavingString{

    public boolean isInterleave(String s1, String s2, String s3){

        if(s1 == null || s2 == null || s3 == null)
            return false;
        if (s1.length() + s2.length() != s3.length)
            return false;


        boolean[][] record = new boolean[s1.length()+1][s2.length()+1];
        record[0][0] = true;
        // i + j denotes the index in S3
        for (int i = 1; i < s1.length() + 1; i++){
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && record[i-1][0]){
                record[i][0] = true;
            }
        }


        // initiate for the edge
        for (int j = 1; j < s2.length() + 1; j++){
            if (s2.charAt( j - 1) == s3.charAt(j -1) && record[0][j-1]){
                record[0][j] = true;
            }
        }

        
        for (int i = 1; i < s1.length() + 1; i++){
            for (int j = 1; j < s2.length() + 1; j++){
                if (s1.charAt(i - 1) == s3.charAt(i+j-1) && record[i-1][j]){
                    record[i][j] = true;
                }
                if (s2.charAt(j - 1) == s3.charAt(i + j - 1) && record[i][j-1]){
                    record[i][j] = true;
                }
            }
        }

        return record[s1.length()][s2.length()];
    }
}



