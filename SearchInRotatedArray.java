public class SearchInRotatedArray{
    boolean result = false;
    public boolean search1(int[] A, int target){

       //find whether there exist a target

        //case 1: middle large than target, than if low is large than target, target in the mid+1 to high
        //case 2: middle large than target, low small than target, target in low to mid 
        //case 3: middle smaller than target, high larger than target, target in mid+1 to high 
        //case 4: middle smaller than target, high smaller than target, target in low to mid. 
        int low = 0, high = n-1;
        while(low <= high){
            int m = (low+high)/2;
            if (A[m] == target) return true;
            // for the second problem, if duplication exist 
            if (A[m] >= A[low]){
                if (A[low] <= target && target <= A[m])
                    high = m - 1;
                else 
                    low = m + 1;
            }

            else
            {
                if (A[m] >= target || target >= A[low])
                    high = m-1;
                else
                    low = m+1;
            }
            //else --> low++;
        }
        return false;
    }
}
       
    

