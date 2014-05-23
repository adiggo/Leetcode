

public class Sqrt(x){

    public int sqrt(int x){
        
        if ( x < 0 )
            return -1;

        long high =  x/2 + 1;
        long low = 0;

        while(low <= high){
            long mid = low + (high - low)/2;
            // binary search---> until x >= mid*mid 
            if (x < mid * mid)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return (int) high;
    }
}

