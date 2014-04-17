public int getTreeHeight(Node root){
    if (root==null)
        return 0;
    int a = getTreeHeight(root.left);
    int b = getTreeHeight(root.right);
    return (a>b?a:b)+1;
}
