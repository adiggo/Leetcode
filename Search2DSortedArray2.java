public class Search2DSortedArray2{
    boolean stepWise(int[][] matrix, int target){
        if (target < matrix[0][0] || target > matrix[N-1][N-1])
            return false;

        int row = 0;
        int column = N - 1;

        while (row < N-1 && col >= 0 ){
            if (mat[row][col] < target)
                row ++;
            else if (mat[row][col] > target)
                col--;
            else return true;
        }
        return false;
    }
}
