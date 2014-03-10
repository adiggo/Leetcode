public class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 0 && n== 0){
            return 0;
        }
        int[][] result = new int[n][m];
        
        result[0][0] = 1;
        for (int i = 1; i<n; i++){
            result[i][0] = 1;
        }
        for (int i = 1; i<m; i++){
            result[0][i] = 1;
        }
        for (int i= 1; i<n; i++){
            for (int j=1; j<m;j++){
                result[i][j] = result[i][j-1]+result[i-1][j];
            }
        }
        return result[n-1][m-1];
        
    }
}