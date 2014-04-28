//get the match count
public int matchCount (Node root, Node p, Node q){
    if (!root)  return 0;
    int match = matchCount(root.left, p, q) + matchCount (root.right, p ,q);
    if (root == p || root == q)
        return 1+match;// if there a match, add 1;
    else 
        return match;
}

public Node getLCA(Node root, Node p, Node q){
    //edge case to consider
    if (root == null || p == null || q == null)
        return null;
    if (root == p || root == q)
        return root;

    int match = matchCount(root.left, p, q);
    // if left-subtree only contains 1, then their least common ancestor must be root
    if (match == 1)
        return root;
    else if (match == 2)
        return getLCA(root.left, p, q);
    else
        return getLCA(root.right, p, q);
}

