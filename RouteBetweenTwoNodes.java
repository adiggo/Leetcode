/**
 *
 *  Find out whether there is a route between two nodes in a graph
 *
 *  apply BFS or DFS should be fine for this problem.
 *  Remember to add a status--> visited or unvisited or unvisiting for the node. since each node may have many children.
 */

public class RouteBetweenTwoNodes{
    
    public enum State{
        Unvisited, Visited, Visiting;
    }

    public static boolean serach (Graph g, node start, Node end){

        List<Node> q = new LinkedList<Node>();
        // assume g has the method to get the nodes
        // also assum each node has a state to identify visited, visiting and unvisited
        for (Node n : g.getNodes()){
            n.state = State.unvisited;
        }
        
        start.state = State.Visiting;
        q.add(start);
        Node u;
        while(!q.isEmpty()){
            u = q.remove();
            if (u != null){
                for (Node v : u.getAdjacent()){
                    if (v.state == State.Unvisited){
                        if (v == end){
                            return true;
                        }else{
                            v.state = State.visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }
}


