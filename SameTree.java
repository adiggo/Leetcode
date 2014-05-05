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
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
       if (root1 == root2) {
        return true;
    }
    if (root1 == null || root2 == null) {
        return false;
    }
    return (root1.val == root2.val) &&
           isSameTree(root1.left, root2.left) &&
           isSameTree(root1.right, root2.right);
    }
}