/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static ArrayList<Integer> postorderTraversal(TreeNode root){
         ArrayList<Integer> res = new ArrayList<Integer>();
         if(root==null) return res;
         
         Stack<TreeNode> s = new Stack<TreeNode>();
         TreeNode cur = root;
         
         while(true){
             if(cur.right!=null)
                 s.push(cur.right);
             s.push(cur);
             if(cur.left!=null)
                 cur=cur.left;
             else{
                 //check whether this left node is a root
                 cur = s.pop();
                 //check for right
                 // if right is null, then it can just put root 
                 while(!s.isEmpty() && (cur.right==null || cur.right!=s.peek())){
                     res.add(cur.val);
                     cur=s.pop();
                 }
                 
                 // 
                 if(cur.right!=null && !s.isEmpty()){
                     s.pop();
                     s.push(cur);
                     cur=cur.right;
                 }
                 if(s.isEmpty()){
                     res.add(cur.val);
                     break;
                 }
             }
         }
         return res;
     }
}