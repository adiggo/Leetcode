public class DeepCopyRandomPointer{
    class RandomListNode{
        int label;
        RandomListNode next, random;
        RandomListNode(int x){ this.label = x;}
    }

    RandomListNode copyRandomList(RandomListNode head){
        if (head == null)
            return null;

        //copy each element in the listnode
        //get its next element and random element by pointer
        
        //use hashmap to correspond the copied one with the original one
        HashMap<RandomListNode> map = new HashMap<RandomListNode>();
        RandomListNode p = head;
        
        while(p != null){
            RandomListNode cur = new RandomListNode(p.label);
            map.put(p, cur);
            p = p.next;
        }


        p = head;
        while(p != null){
            RandomListNode n = map.get(p);
            //initialization
            n.next = null;
            n.random = null;
            
            if (p.next != null)
                //method return a new object
                n.next = map.get(p.next);

            // if write as---> map.get(p).random = p.random 
            // the above method is not deep copy, it does not generate a new object,
            // since p.random is the object already exist, not a new one, so it means if we do so, just the reference point to object
            if (p.random != null)
                n.random = map.get(p.random);
            p = p.next;
        }
        return map.get(head);
    }
}
        



