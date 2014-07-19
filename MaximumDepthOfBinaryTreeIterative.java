/**
 *  Use level order traversal to traverse the array,
 *
 *
 */

import java.util.*;
public class MaximumDepthOfBinaryTree{
    int maxDepth(TreeNode root){
        if (root == null)
            return 0;
        
        ArrayList<TreeNode> q = new ArrayList<TreeNode>();
        q.add(root);
        int depth = 0;

        while(!q.isEmpty()){
            ArrayList<TreeNode> next = new ArrayList<TreeNode>();
            for (TreeNode node : q){
                if (node.left != null)
                    next.add(node.left);
                if (node.right != null)
                    next.add(node.right);
            }
            q = new ArrayList<TreeNode>(next);
            depth++;
        }
        return depth;
    }
}
