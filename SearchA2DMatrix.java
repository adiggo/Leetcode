
public class SearchA2DMatrix{
    
    public boolean searchMatrix(int[][] matrix, int target){

        int start = 0;
        int end = matrix[0].length - 1;

        // start to end

        while(start < end){// the condition should be smaller, since if equal there will be endless
            int middle = (start + end) /2;
            if (target < matrix[middle][0]){
                end = middle;
            }else if (target > matrix[middle][0]){
                start = middle + 1;
            }else if (target == matrix[middle][0]){
                return true;
            }
        }

        //start is the row index
        int startRow = 0;
        int endRow = matrix.length - 1;
        // iteration



    }
}


        

