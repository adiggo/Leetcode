public class Solution {
    ArrayList<Integer> returnList = new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) throws NullPointerException{
        
        // arraylist<Integer> list
        // this is kind of like 
       
 
        // empty arraylist
        if(root == null)
            return returnList;
        // add the first element into returnList;
        returnList.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return returnList;
        
    }
}