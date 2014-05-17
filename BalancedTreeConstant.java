/**
 *
 *  Check the BalancedTree, if we use recursion, then the time is O(NlogN)
 *  Since in each node, we have recursed its sub-tree entirely.
 *  For the first method, we know that getHeight takes O(N) time, then isBalacned is 
 *  O(logN) time, then the total time is O(NlogN).
 *
 */


public class BalancedTreeConstant{
    /**
     *  And when we get its height, we can actually check whether it is balanced, when we get a root's left
     *  and right's height, then we can check whether they are Balanced.
     */
    public int checkHeight(TreeNode root){
        if (root == null)
            return 0;
        int left = checkHeight(root.left);
        
        if (left == -1)
            return -1;
        
        int right = checkHeight(root.right);
        if (right) == -1)
            return -1;

        int heightDiff = left - right;

        if (Math.abs(heightDiff) > 1)
            return -1;
        else
            return Math.max(left, right) + 1;
    }


    public static boolean isBalacned(TreeNode root){
        if (checkHeight(root) == -1)
            return false;
        else
            return true;
    }

}


