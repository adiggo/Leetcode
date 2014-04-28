// get the match amount of that node for p and q
public int LCA(Node root, Node p, Node q){
    if (!root) 
        return 0;
    int match = LCA(root.left, p, q) + LCA(root.right, p, q);
   //condition to trigger the edge
    if (root == p || root == q)
        return 1 + match;
    else
        return match; 
}
// return the LCA node according to match count;
// if match count == 1, return that node
// if match count == 2, go to left;
// else go to right;

Node getLCA(Node root, Node p, Node q){
    if (!root || !p || !q) return null;
    // this is ensured by if match count = 1, then the node will be returned
    // if match node == 1, return that node
    if (root == p || root == q) return root;
    int mactch = LCA(root.left, p, q);
    if (match == 1)
        return root;
    else if (match == 2)
        return getLCA(root.left, p, q);
    else 
        return getLCA(root.right, p, q);
    }
}
