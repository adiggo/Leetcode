public class Solution{

    public boolean isSymmetric(TreeNode root){

        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }


    public boolean isSymmetric(TreeNode a, TreeNode b){
        if (a == null) return b==null;
        if (b == null) return false;

        if (a.val != b.val) return false;

        if (!isSymmetric(a,left, b.right)) return false;
        if (!isSymmetric(a.right, b.left)) return false;

        return true;
    }
}
