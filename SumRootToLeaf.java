/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        return sums(root,"0");
    }
    public int sums(TreeNode root,String sum){
        sum = sum+root.val;
        int lval = 0;
        int rval = 0;
        if(root.left != null) lval = sums(root.left,sum);
        if(root.right != null) rval = sums(root.right,sum);
        if(root.left == null && root.right==null){
            return Integer.parseInt(sum);
        }
        else{
            // important to return the summation of lval and rval;
            return lval+rval;
        }
    }

}
