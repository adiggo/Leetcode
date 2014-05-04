/**
 *BinaryTreeMaximumSumPath can get the 
 *
 */
public class BinaryTreeMaximumSumPath{
    int max;
    public int maxPathSum(TreeNode root){
        max = (root == null) ? 0 : root.val;
        findMax(root);
        return max;
    }

    public int findMax(TreeNode node){
        if (node == null)
            return 0;
       //consider if there is negative, don't get it into the summation
        int left = Math.max(findMax(node.left), 0);
        int right = Math.max(findMax(node.right), 0);
        // this step is crucial important, since if the root of subtree is negative, we won't take it into summation
        // for example, 
        max = Math.max(node.val + left + right, max);
        //get the maximum one side
        return node.val + Math.max(left,right);
    }
}
    

