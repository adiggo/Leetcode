Class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
        left = null;
        right= null;
    }
}


public class Solution{
    public ArrayList<TreeNode> res = new ArrayList<TreeNode>();
    public void pre_recur (TreeNode root, ArrayList<Integer> res){
        if (!root){
            return;
        }else{
            res.add(root.val);
            if (root.left!=null){
                pre_recur(root.left,res);
            }
            if (root.right!=null){
                pre_recur(root.right,res);
            }
        }
    }
    

    public void pre_norecur(TreeNode root){
        Stack<TreeNode> stack = new  Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            res.add(temp.val);            
            if (!temp.right){
                stack.push(temp.right);
            }
            if(!temp.left){
                stack.push(temp.left);
            }
        }
    }
}
