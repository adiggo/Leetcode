Class JumpGame{
public:
    bool canJump(int A[], int n){
        int* jump = new int[n];
        jump[0]= 0;
        for(int i=1; i<n; i++){
            jump[i]=max(jump[i-1],A[i-1])-1;
            if (jump[i]<0)
                return false;
        }
        return jump[n-1] >=0;
    }
    
};
