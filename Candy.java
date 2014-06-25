/**
 *
 *  Scan twice --> first increse, then from end 
 *
 *
 */


public class Solution {
    public int candy(int[] ratings) {
        if (ratings.length == 0 ||ratings == null)
            return 0;
        if (ratings.length == 1)
            return 1;
        int[] record = new int[ratings.length];
        for (int i=0; i<record.length; i++)
            record[i] = 1;
        
        for (int i=0; i<ratings.length-1;i++){
            if(ratings[i]<ratings[i+1])
                record[i+1]=record[i]+1;
        }
        
        for (int j=ratings.length-2; j>=0; j--){
            if (ratings[j] >ratings[j+1] && record[j] <= record[j+1])
                record[j]= record[j+1]+1;
        }
        
        
        
        int result = 0;
        for (int k=0; k<record.length; k++)
            result +=record[k];
        return result;
        
    }
}
