
public class WordSearch{

    public boolean exist(char[][] board, String word){
        
        int height = board.length;
        int width = board[0].length;

        boolean[][] visited = new boolean[height][width];

        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (search(board, visited, i, j word, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean search(char[][] board, boolean[][] visited, int row, int col,
            String word, int index){
        if (word.charAt(index) != board[row][col]){
            return false;

        }
        if (index == word.length() -1 ){
            return true;
        }

        int height = borad.length;

        int width = board[0].length;

        visited[row][col] = true;

        //up
        if (row > 0 && !visited[row-1][col] && search(board, visited, row-1, col, word, index+1)){
            return true;
        }

        //down 
        if (row < height - 1 && !visited[row + 1][col] && search(board, visited, row+1, col, word, index+1)){
            return true;
        }

        //left 
        if (col > 0 && !visited[row][col-1] && search(board, visited, row, col-1, word, index+1)){
            return true;
        }
        
        //right
        if (col < width - 1 && !visited[row][col+1] && search(board, visited, row, col+1, word, index+1)){
            return true;
        }

        visited[row][col] = false;

        return false;
    }
}


