//two pointer
ListNode detectCycle(ListNode head){
    ListNode n1 = head;
    ListNode n2 = head;

    while(n2!=null){
        n2  = n2.next;
        n1 = n1.next;
        if (n2.next != null){
            n2 = n2.next;
        }
        //break the loop
        if (n1 == n2)
            break;
    }
    
    if (n2 == null) return null;
    
    n1 = head;
    while(n1 != n2){
        n1 = n1.next;
        n2 = n2.next;
    }
    return n2;
}

    
