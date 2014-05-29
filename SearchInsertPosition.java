public class SearchInsertPosition{

    public int search (int[] A, int n, int target){
        
        int l = 0, r = n-1;
        while( l<= r){
            int mid = (l+r)/2;
            if (A[mid] == target) return mid;
            if (mid>1 && A[mid]>target && A[mid-1]<target) return mid;
            if (A[mid]> target)
                r = mid -1;
            else
                l = mid + 1;
        }
        return l; // since divide in java takes floor, so mid output is l-1 for the particular situation
    }
}
