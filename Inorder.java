Class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }
}

Class Solution{

    public void in_recur(TreeNode root, ArrayList<Integer> res){
        if (!root)
            return;
        else{
            if (root.left!=null){
                in_recur(root.left,res);
            }
            res.add(root.val);
            if (root.right != null){
                in_recur (root.right,res);
            }
        }
    }

    void in_norecur(TreeNode root, ArrayList<Integer> res){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(true){
            if (root != null){
                stack.push(root);
                root = root.left;
            }else{
                if (!stack.isEmpty()){
                    TreeNode top = stack.pop();
                    res.add(top.val);
                    root = top.right;
                }else{
                    break;
                }
            }
        }
    }
}
