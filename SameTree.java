/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * if two tree is equal, then the root should be equal, and its lefttree and righttree should be equal.
 *
 */
public class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null){
            return true;
        }else if (p != null && q!= null){
            if (p.val == q.val){
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }else{
            return false;
        }
        return false;
    }
}

