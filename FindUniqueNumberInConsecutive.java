/**
 *
 *  input is an array, from 1 to n, and there are total n+1 number, only one is 
 *  duplicate, find the duplicate number.
 *
 *
 *
 */
public class FindUniqueNumberInConsecutive{
    
    public int find(int[] input){

        int length = input.length;

        if (length == 0 || input == null)
            return 0;

        int sum = (length-1)*(length-2)/2;
        int actualSum = 0;
        
        for (Integer i : input){
            actualSum += i;
        }
        
        return actualSum-sum;
    }
}
