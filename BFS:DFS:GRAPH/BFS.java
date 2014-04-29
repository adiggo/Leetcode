
public class BFS{
    public void bfs(Node root){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        HashSet<Node> set = new HashSet<Node>();
        set.add(root);

        while(!q.isEmpty()){
            int first = q.poll();
            //assume there are a node function which has a children collection
            for (Node n : first.children){
                if (!set.contains(n)){
                    set.add(n);
                    q.add(n);
                }
            }
        }
    }


