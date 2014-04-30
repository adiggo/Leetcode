public class Solution {
    public void reorderList(ListNode head) {
        //divide list into half
        if (head == null || head.next == null){
            return;
        }
        ListNode cur = head;
        int count = 0;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        //count is the length of list
        
        ListNode headt = head;
        for (int i=1; i<count/2; i++){
            headt = headt.next;
        }
        ListNode head2 = headt.next;
        
        //reverse head2;
        
        
        headt.next = null;
        ListNode pre = null;
        ListNode cur1 = head2;
        ListNode cur2 = null;
        while (cur1 != null){
            ListNode next = cur1.next;
            cur1.next = pre;
            pre = cur1;
            if (next == null){
                cur2 = cur1;
            }
            cur1 = next;
        }
        
        ListNode newCur = head;
        
        //cur1 and head
        while(newCur!=null){
            ListNode next1 = newCur.next;
            ListNode next2 = cur2.next;
            newCur.next = cur2;
            if (next1!=null)
                cur2.next = next1;
            newCur = next1;
            cur2 = next2;
        }
        
   
        
    }
}