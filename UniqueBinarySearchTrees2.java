public class UniqueBinarySearchTree2{
    public List<TreeNode> generate(int n){

        return helper(1, n);
    }

    List<TreeNode> helper(int left, int right){

        List<TreeNode> res = new ArrayList<TreeNode>();
        if (left > right){
            res.add(null);
            return res;
        }
        for (int i = left; i<=right; i++){
            TreeNode leftNodes = helper(left, i - 1);
            TreeNode rightNodes = helper(i+1, right);
            for (TreeNode leftNode : leftNodes){
                for (TreeNode rightNode : rightNodes){
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
