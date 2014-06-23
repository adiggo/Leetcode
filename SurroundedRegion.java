/**
 *
 *  Good question of solving surrounded region. 
 *  Use BFS, but remember to start from the edge is the best case.
 *
 *
 */

public class Solution {
    private Queue<Integer> queue = new LinkedList<Integer>();
    // apply bfs to detect whether it can go to boundary of '0'
    public void solve(char[][] board) {
       // the '0' is surrounded if it cannot go to the boudary.
       // set four boundary
        if (board.length == 0) {
            return;
        }
        if (board[0].length == 0) {
            return;
        }
        int row = board.length;
        int col = board[0].length;
        // start from up, bottom row and column
        // since we need to find out whether there are "0" exist there
        // this is the only way that they are not surrounded
        // up row
        for (int j = 0; j < col; j++) {
            if (board[0][j] == 'O') {
                bfs(board, 0, j);
            }
        }

        // bottom row
        for (int j = 0; j < col; j++) {
            if (board[row - 1][j] == 'O') {
                bfs(board, row - 1, j);
            }
        }

        // left column
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') {
                bfs(board, i, 0);
            }
        }

        // right column
        for (int i = 0; i < row; i++) {
            if (board[i][col - 1] == 'O') {
                bfs(board, i, col - 1);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'P') {
                    board[i][j] = 'O';
                }
            }
        }

    }
    // this method change passed "0" as "P"
    private void fill(char[][] board, int i, int j) {
        int row = board.length;
        int col = board[0].length;
        // i and j must be in a region so that i and j is valid
        if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] != 'O')
            return;

        queue.offer(i * col + j);
        //indicate that i,j can be passed out of the surrounded region
        board[i][j] = 'P';
    }
   // do bfs
    private void bfs(char[][] board, int i, int j) {
        int col = board[0].length;

        fill(board, i, j);
        // queue.offer()
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            //get the cur index
            int x = cur / col;
            int y = cur % col;
            // fill its surrounded region
            // with the requirement that x, y is met the condition in fill function
            fill(board, x - 1, y);
            fill(board, x + 1, y);
            fill(board, x, y - 1);
            fill(board, x, y + 1);
        }
    }
}
