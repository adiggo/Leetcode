public class Solution{

    public void connect(TreeLinkNode root){
        if (root == null) return;

        if (root.left != null){
            if (root.right != null){
                root.left.next = root.right;
            }
            else{
                TreeLinkNode temp = root.next;
                while (temp != null && temp.left == null && temp.right == null){
                    temp = temp.next;
                }

                if (temp != null){
                    root.left.next = p.left == null ? p.right : p.left;
                }
            }
        }

        if (root.right != null){
            TreeLinkNode temp = root.next;
            while (temp != null && temp.left == null && temp.right == null){
                temp = temp.next;
            } 
            if (temp != null)
                root.right.next = temp.left == null ? temp.right : temp.left;
        }

// right side need to be connected first. Since this is not a balanced tree.
        connect(root.right);
        connect(root.left);
    }
}
