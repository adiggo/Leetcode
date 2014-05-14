/**
 *
 * In this method, we just apply iteration to solve this problem. 
 * Each time we set up a across start from the most left of each level,
 * then go right until no right exist.
 */


public class PopulatinNextRightPointer{
    public void connect(TreeLinkNode root){
        TreeLinkNode left = root;

        while (left != null){
            TreeLinkNode across = left;

            while(across != null){
                if (across.left != null)
                    across.left.next = across.right;
                if (across.right!= null && across.next != null)
                    across.right.next = across.next.left;
            }
            across = across.left;
        }
        left = left.left;
    }
}
