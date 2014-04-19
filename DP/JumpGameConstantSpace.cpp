bool canJump(int A[], int n){
    int maxi = 0;
    for (int start = 0; start<=maxi && start<n; start++ ){
        if (A[start]+start >maxi)
            maxi = A[start]+start;
        if (maxi >=n-1) return true;
    }
    return false;
}
