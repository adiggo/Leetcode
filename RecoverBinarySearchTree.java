/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    TreeNode p,q;
    TreeNode pre;
    public void recoverTree(TreeNode root) {
        if (root == null) return;
        getWrong(root);
        int tmp = p.val;
        p.val = q.val;
        q.val = tmp;
    }
    //中序遍历。p为最左边的错误节点，q为最右边的错误节点。
    public void getWrong(TreeNode root) {
        if (root == null) return;
        getWrong(root.left);
        if (pre != null && root.val < pre.val) {
            if (p == null) {
                p = pre;
                q = root;
            }
            else 
                q = root;
        }
        pre = root;
        getWrong(root.right);
    }
    
}