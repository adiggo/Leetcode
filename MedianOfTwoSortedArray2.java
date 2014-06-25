
public class MedianOfTwoSortedArray2{
        
    double findMedianSortedArrays(int A[], int B[]){
            // if the length of A and B is even, so the median of the array 
            // is two integer /2 
        if ( (n+m) % 2 == 0)
        {
            return (GetMedian(A, m, B, n, (m+n)/2) + GetMedian(A, m, B, n, (m+n)/2 + 1))/2.0;
        }

        else
        {
            return GetMedian(A,  m, B, n, (m+n)/2+1);
        }
    }

        
