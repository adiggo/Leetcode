import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII {
	public void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		Queue<TreeLinkNode> nextQueue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		TreeLinkNode left = null;
		while (!queue.isEmpty()) {
			TreeLinkNode node = queue.poll();
			if (left != null) {
				left.next = node;
			}
			left = node;
			if (node.left != null) {
				nextQueue.add(node.left);
			}
			if (node.right != null) {
				nextQueue.add(node.right);
			}
			if (queue.isEmpty()) {
				Queue<TreeLinkNode> temp = queue;
				queue = nextQueue;
				nextQueue = temp;
				left = null;
			}
		}
	}
}