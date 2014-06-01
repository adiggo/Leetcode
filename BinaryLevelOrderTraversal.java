
public class BinarayLevelOrderTraversal{
    
    ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
        public ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();  // the result need to be reversed

        queue.add(root);

        while(!queue.isEmpty()){
            ArrayList<TreeNode> tempList = new ArrayList<TreeNode>();  // used for store nodes
            ArrayList<Integer> tempValueList = new ArrayList<Integer>(); // used for store values

            while(!queue.isEmpty()){
                TreeNode node = queue.remove();
                tempList.add(node);
                tempValueList.add(node.val);
            }
            list.add(tempValueList);
            
            for (int i = 0; i < tempList.size(); i++){
                TreeNode node = tempList.get(i);
                if(node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--){
            result.add(list.get(i));
        }
        return result;
    }
}


