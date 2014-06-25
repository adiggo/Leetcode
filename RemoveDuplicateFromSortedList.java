public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode prev = new ListNode(0);
        prev.next = head;
        head = prev;
        
        ListNode n1=head;
        while(n1.next!=null){
            ListNode n2=n1.next;
            while(n2.next!=null && n2.next.val==n2.val){
                n2=n2.next;
            }
            if(n2!=n1.next){
                n1.next=n2.next;
            }else{
                n1=n1.next;   
            }
        }
        return head.next;
    }
}