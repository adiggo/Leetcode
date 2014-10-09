/**
 *
 *  We need to leftDummy, rightDummy and left, right which record its left and right current status. Left and right is recording its prev.
 *  leftDummy and rightDummy is good used for recording its initial prev. left.next = rightDummy.next, and return leftDummy.next;
 *
 */

public class PartitionList{
   public ListNode partition (ListNode head, int x){
       if (head == null)
            return null;
       ListNode leftDummy = new ListNode(1);
       ListNode rightDummy = new ListNode(1);

       ListNode left = leftDummy;
       ListNode right = rightDummy;

       //in case of head is null
       while(head != null){

           if (head.val < x){
               left.next = head;
               left = head;
           }else{
               right.next = head;
               right = head;
           }

           head = head.next;
       }
       right.next = null;
       left.next = rightDummy.next;
       return leftDummy.next;
   }
}
