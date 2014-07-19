public class SortList2{
   /**
    *Find the length of linkedlist
    *
    */
    ListNode sortList(ListNode head){
        if (head == null)
            return null;

        int len = 0;
        ListNode first = head;
        while(first != null){
            len++;
            first = first.next;
        }
        ListNode newHead = sort(head, len);
        return newHead;
    }

    //divide the linkedlist
    ListNode sort (ListNode head, int length){
        if (length == 1)
        {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }// this is very important to to make its next become null.

        ListNode leftHead = sort(head, length/2);
        ListNode rightHead = sort(head, length- length/2);

        ListNode newHead = merge(leftHead, rightHead);
        return newHead;
    }
    ListNode merge(ListNode first, ListNode second){
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(first != null || second != null)
        {
            int f = first == null ?  Integer.MAX_VALIE:first.val;
            int s = second == null? Integer.MAX_VALIE , second.val;
            if (f < s){
                cur.next = first;
                first = fisrt.next;
            }
            else
            {
                cur.next = second;
                second = second.next;
            }
            cur = cur.next;
        }
        cur = head.next;
        return cur;
    }
}
