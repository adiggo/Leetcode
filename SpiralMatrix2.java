public class Solution {
    public int[][] generateMatrix(int n) {
        if (n < 0) return null;
        int[][] result = new int[n][n];
        if (n == 0) return result;
        int value = 1;
        int x=0; 
        int y=0;
  
 
        while(n>0){
 
            //if one row/column left, no circle can be formed
            if (n == 1){
                result[x][y] = value;
            }
 
            //below, process a circle
 
            //top - move right
            for(int i=0;i<n-1;i++){
                result[x][y] = value;
                y++;
                value++;
            }
 
            //right - move down
            for(int i=0;i<n-1;i++){
                result[x][y] = value;
                x++;
                value++;
            }
 
            //bottom - move left
            for(int i=0;i<n-1;i++){
                result[x][y] = value;
                y--;
                value++;
            }
 
            //left - move up
            for(int i=0;i<n-1;i++){
                result[x][y] = value;
                x--;
                value++;
            }
 
            x++;
            y++;
            n = n-2;
        }
 
        return result;
        
    }
}
