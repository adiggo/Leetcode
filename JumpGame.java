import java.util.*;
public class JumpGame{
    // DP to solve this problem
    // assume there is no negative number
    public boolean canJump(int[] A){
        //define a int[] state which can represent the status
        int[] state = new int[A.length];
        state[0]= A[0];
        if (state[0]==0 &&A.length>1){
            return false;
        }
        //running time is O(n)
        //space complexity is O(n)
        //is there any possiblity to reduce the complexity?
        for (int i=1; i<A.length; i++){
            state[i]= Math.max(state[i-1], A[i]+i);
            if (state[i]<=i && i<A.length-1){
                return false;
            }
        }
        return true;
    }
}
