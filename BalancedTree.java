/**
 *
 *
 *  What is a balanced tree: two subtree height difference no more than 1
 *  So we need to get the height of each node.
 *  write a separate function to decide the height of each treenode. 
 *  
 *
 */


public class Solution {

    /**
     *
     *  Check whether the tree is balanced by getting the height of 
     *  tree. 
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        // basic logic 
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (Math.abs(left - right) > 1) return false;
            
        return isBalanced(root.left) && isBalanced(root.right);
    }
/**
 *
 *  Get the height of tree; return 0 if node is null,---> boundary condition.
 *  
 */

private int getHeight(TreeNode n) {
    if (n == null) return 0;

    return Math.max(getHeight(n.left), getHeight(n.right)) + 1;
    }
}
