public class Solution {
    public void rotate(int[][] matrix) {
        // for this problem we need to solve it by each side
        int n  = matrix.length;
        int[][] m = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                m[i][j] = matrix[i][j];
            }
        } 
        
        //left to above
        for(int j =0; j<n/2; j++){
            for (int i =j; i<n-j; i++){
                matrix[i][n-j-1] = m[j][i];
            }
        }
        
        //set new rigth: above to right
        for (int j = 0; j<n/2; j++){
            for(int i =j; i<n-j; i++){
                matrix[n-j-1][i] = m[n-i-1][n-j-1];
            }
        }
        
        // set new bottom
        for (int j = 0; j<n/2; j++){
            for(int i =j; i<n-j; i++){
                matrix[n-i-1][j] = m[n-j-1][n-i-1];
            }
        }
        
        //set new right
        
         for (int j = 0; j<n/2; j++){
            for(int i =j; i<n-j; i++){
                matrix[j][i] = m[n-i-1][j];
            }
        }
      
        //bottom to left
            
        
    }
}