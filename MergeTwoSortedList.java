
public class MergeTwoSortedList{
    
    // merge two sorted list
    // to achieve this compare each node in the list
    //

    public ListNode merge(ListNode l1, ListNode l2){
       if (l1 == null && l2 == null)
            return null;
       
        ListNode newHead = new ListNode(1);
        ListNode temp = newHead;
        while(l1 != null || l2 != null){
            if (l1 != null && l2 != null){
                if (l1.val < l2.val){
                    temp.next = l1;
                    l1 = l1.next;
                }
                else{
                    temp.next = l2;
                    l2 = l2.next;
                }
            }else if (l1 != null && l2 == null){
                temp.next = l1;
                l1 = l1.next;
            }else if (l1 == null && l2 != null){
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        return newHead.next;
    }
}
