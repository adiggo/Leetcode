public class CloneGraph{
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){

        // here we need to do a deep copy-----clone the whole graph
        //best implementation method is use map
        if (node == null)
            return null;

        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        HashMap<UndirectedGraphNode> map = new HashMap<UndirectedGraphNode>();
        UndirectedGraphNode newHead = new UndirectedGraphNode();
        
        queue.add(node);
        //new head
        map.put(node, newHead);
        while(!queue.isEmpty()){
            UndirectedGraphNode cur = queue.pop();
            ArrayList<UndirectedGraphNode> neighbor = cur.neighbors;

            for (UndirectedGraphNode n : neighbor){
                if (!map.containKey(n)){
                    //copy
                    UndirectedGraphNode copy = new UndirectedGraphNode(n.label);
                    //put it into graph
                    map.put(n, copy);
                    map.get(cur).neighbors.add(copy);
                    queue.add(n);
                }
                else{
                    map.get(cur).neightbors.add(map.get(n));
                }
            }
        }
        return newHead;
    }
}





