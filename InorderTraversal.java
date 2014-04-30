public class Solution {
public  ArrayList<Integer> inorderTraversal(TreeNode root) {
            // Start typing your Java solution below
            // DO NOT write main() function
            ArrayList<Integer> res = new ArrayList<Integer>();
            if(root==null) return res;
            
            Stack<TreeNode> s = new Stack<TreeNode>();
            TreeNode cur = root;
            //if root != null, keep push left into stack
            //if s is not empty, add value in the result
            //root = cur.right;
            while(true){
                if (root != null){
                    s.push(root);
                    root = root.left;
                }else{
                    if (!s.isEmpty())
                    Node cur = s.peek();
                     res.add(s.pop());
                     s.push(cur.value);
                     root = cur.right;
                } else{
                    break;
                }
            }
}


                     

