public int getHeight(Node root){
    if (!root)
        return 0;
    int left = getHeight(root.left)+1;
    int right = getHeight(root.right)+1;
    return Math.max(left, right);
}
