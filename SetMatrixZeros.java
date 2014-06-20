public class SetMatrixZeros{

    //1. utilize the resource that already has been used
    //2. select the first row and column, scan, find whether there are zero in the first row and column
    //3. put the other element zero into its corresponding first row and column
    //4. then according to the first row and column, set zeros in place.

    void setZeros(int[][] matrix){
        boolean zeroInFirstColumn = false, zeroInFirstRow = false;

        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] == 0){
                zeroInFirstRow = true;
            }
        }
        for (int i = 0; i < matrix[0].length; i++){
            if (matrix[0][i] == 0){
                zeroInFirstColumn = true;
            }
        }

        // scan the whole array
        for (int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        // do it in place
        for (int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
    
        //check edge
        if (zeroInFirstColumn == true){
            for (int i  = 0;i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }

        if (zeroInFirstRow == true){
            for (int i = 0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }

    }
}





