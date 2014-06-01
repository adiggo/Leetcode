
public class SortColors{
    
    void sortColor(int[] A){
       // set two edge. 

        int redst = 0, bluest = n - 1;
        int i = 0;

        while(i < bluest + 1){
            if (A[i] == 0){
                swap(A[i], A[redst]);
                redst++; //denotes red index is increasing
                i++;
                continue;
            }
            if (A[i] == 2){
                swap(A[i], A[bluest]);
                bluest--;
                continue;
            }
            i++;
        }
    }
}

