
/**
 *
 * this required constant space, so we have to use two pointer method
 *
 *
 */

public class PopulatingNextRightPointersInEachNodeII {
	public void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
    
		TreeLinkNode nextHead = null;
		TreeLinkNode p = root;
		TreeLinkNode pre = null;
		while (p != null) {
        
			if (p.left != null) {
                    
				if (pre == null) {
					pre = p.left;
					nextHead = pre;
				} else {
					pre.next = p.left;
					pre = pre.next;
				}
			}
            //update nextLevelEnd(pre) when it is not null
			if (p.right != null) {
				if (pre == null) {
					pre = p.right;
					nextHead = pre;
				} else {
					pre.next = p.right;
					pre = pre.next;
				}
			}
            //check for next pointer 
            //if it is null, then go to next level
            //if not, then go next loop
			p = p.next;
			if (p == null) {
				p = nextHead;
				nextHead = null;
				pre = null;
			}
		}
	}
}
