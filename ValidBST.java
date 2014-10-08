public class ValidBST{
    TreeNode prev = null;
    public boolean validBST(TreeNode root){
        
        if (root != null){
            if (!validBST(root.left))
                return false;
            if (prev != null && root.val <= prev.val)
                return false;
            prev = root;
            if (!validBST(root.right))
                return false;
        }
        return true;
    }
}


