
public class StrategyForAGame{
    
    public int optimalStrategyOfGame(int[] array){

        int[] table = new int[array.length][array.length];

        for (int interval = 0; interval < n; ++interval){
            for (i = 0, j = interval; j<n; ++i, ++j){
                x = (( i+2 ) <= j) ? table[i+2][j] : 0;
                y = ((i+1) <= (j-1)) ? table[i+1][j-1]:0;
                z = (i <= (j-2))?table[i][j-2] : 0;

                table[i][j] = max(array[i] + min(x,y), array[j]+min(y,z));
            }
        }
    }
}


