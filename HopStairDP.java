

public class HopStartDP{
    
    public int count(int n, int[] map){
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else if (map[n] > -1){
            return map[n];
        }
        else{
            map[n] = count(n-1, map) +
                count(n-2, map) +
                count(n-1, map);
        }
    }
}
