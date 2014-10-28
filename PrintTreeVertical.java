public class PrintTreeVertical{

    public void print(TreeNode root){
        HashMap<Integer, List<TreeNodes>> map = new HashMap<Integer, List<Nodes>>();
        printVertical(root, map, 0);
    }
    private void printVertical(TreeNode root, HashMap<Integer, List<TreeNodes>> map, int weight){
        if (head == null)
            return;
        if (map.containsKey(weight)){
            map.get(weight).add(head);
        }else{
            map.put(weight, new ArrayList<TreeNode>().add(head));
        }
        printVertical(root.left, map, weight - 1);
        printVertical(root.right, map, weight+1);
    }
        
