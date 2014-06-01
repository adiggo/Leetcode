/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        //creat fake header node
        ListNode fake = new ListNode(0);
        fake.next = head;
        
        ListNode pre = fake;
        ListNode cur = head;
        
        while(cur != null && cur.next != null){
            pre.next = cur.next;
            cur.next = cur.next.next;
            pre.next.next = cur;

            pre = cur;
            cur = pre.next;
        }
        
        return fake.next;
    }
}