/**
 *In this implementation, to solve it in non-recursive way, we need to use two stack to keep track of its information
 * @author Xiaoping
 *
 */
public class PostOrderTraversal{
    
    // left ---> right ----> root
    public ArrayList<Node> postOrder(ArrayList<Node> result, Node root){
        

        if (root == null)
            return null;
        if (root.left != null)
           postOrder(result, root.left);
        if (root.right != null)
            postOrder(result,root.right);
        return result.add(root);       
    }
}
    public ArrayList<Node> postOrderIte(Node root){
        ArrayList<Node> result = new ArrayList<Node>();
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(root);
        while(!s1.isEmpty()){
            Node cur = s1.pop();
            s2.push(cur);

            if (cur.left != null){
                s1.push(cur.left);
            }
            if (cur.right != null)
                s1.push(cur.right);
        }

        while(!s2.isEmpty()){
            Node cur = s2.pop();
            result.add(cur);
        }
    }
}





        
