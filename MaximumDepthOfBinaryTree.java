public class MaximumDepthOfBinaryTree{
    public int getDepth(TreeNode root){
        if (root == null)
            return 0;

        // Apply DP to solve this problem.
        // so I can directly compare getDepth(root.left) and getDepth(root.right);
        // use left and right to record maximum depth of left and right. 
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}

