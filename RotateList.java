public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if (head==null|| n==0){
            return head;
        }
        
        int len=1;
        ListNode last=head;
        
        // calculate the lenght of given list
        while(last.next!=null){
            last=last.next;
            len++;
        }
        
        last.next=head;
        
        // Should considered the situtation that n larger than given list's length
        int k=len-n%len;
        ListNode preHead=last;
        
        // find the point which are previuse for our target head
        while(k>0){
            preHead=preHead.next;
            k--;
        }
        
        head=preHead.next;
        preHead.next=null;
        
        return head;
        
    }
}