public class MinimumBinaryTreeDepth{
    public int minDepth(TreeNode root){
        if (root == null)
            return 0;
        return int min(root);
    }
    private int min(TreeNode root){
        if (root == null)
            return 0;
        int left = min(root.left);
        
        int right = min(root.right);

        if (left == 0 && right == 0)
            return 1;
        else if (left == 0)
            return right + 1;
        else if (right == 0)
            return left + 1;
        else
            return Math.min(left + right) + 1;
    }
}
