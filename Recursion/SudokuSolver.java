public class Solution {
    public void solveSudoku(char[][] board) {
        // each column and each row contain 1 to 9 and  no duplication
        //find all '.' index
        ArrayList<Integer> array=getArrayList(board);
  
        dfs(board,0, array);
    }
    
    public ArrayList<Integer> getArrayList(char [][]board){
        ArrayList<Integer> array=new ArrayList<Integer>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    array.add(i*9+j);
                }
            }
        }
        return array;
    }
    
    boolean dfs (char[][] board, int index, ArrayList<Integer> array){
        int len = array.size();
        
        if (index == len)
            return true;
        int data = array.get(index);
        int row = data/9;
        int column = data%9;
        
        for (int i = 1; i <= 9; i++){
            
                if (isValid(board, row ,column, i)){
                    board[row][column] = (char) (i + '0'); 
                    if (dfs(board, index+1, array))
                        return true;
                    board[row][column]='.';
                }
        }
        return false;
    }
    
    private boolean isValid(char[][] board, int row, int column, int input){
        //make decision whether this number is valid
        //row
      
        for (int i = 0; i < 9; i++){
            if (board[row][i] - '0' == input){
                return false;
            }
            if (board[i][column] - '0'== input){
                return false;
            }
        }
        //check grid
        for (int j = 0; j < 3; j++){
            for (int k = 0; k<3; k++){
                if (board[row/3*3 + j][column/3*3+k] - '0' == input){
                    return false;
                }
            }
        }
        return true;
    }
}