public RandomListNode copyRandomList(RandomListNode head) {
	if (head == null)
		return null;
	HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
	RandomListNode newHead = new RandomListNode(head.label);
 
	RandomListNode p = head;
	RandomListNode q = newHead;
	map.put(head, newHead);
 
	p = p.next;
	while (p != null) {
		RandomListNode temp = new RandomListNode(p.label);
		map.put(p, temp);
		q.next = temp;
		q = temp;
		p = p.next;
	}
 
	p = head;
	q = newHead;
	while (p != null) {
		if (p.random != null)
			q.random = map.get(p.random);
		else
			q.random = null;
 
		p = p.next;
		q = q.next;
	}
 
	return newHead;
}