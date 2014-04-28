/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
 public ListNode sortList(ListNode head){
	        if (head==null || head.next==null){
	            return head;
	        } 
	        
	        ListNode counter=head;
	        int len=0;
	        while(counter!=null){
	            counter=counter.next;
	            len++;
	        }
	        ListNode[] headArray={head};
	        return mergeSort(headArray, len);
	     }
	     private ListNode mergeSort(ListNode[] headArray, int len){
	         // triger condition for recursion 
	         // in sort a array, the condition change to be if (low < high)
	         if (len==1){
	             
	             ListNode temp=headArray[0];
	             headArray[0]=headArray[0].next;
	             
	             temp.next=null; //divide the linkedlist into separate part
	             
	             return temp;
	         }
	         //left and right are comparatively left and right
	         ListNode left=mergeSort(headArray, len/2);
	         ListNode right=mergeSort(headArray, len-len/2);
	         
	         return merge(left, right);
	     }
	     
	     
	     private ListNode merge(ListNode left, ListNode right){
	         // for edge case
	         if (left==null)
	             return right;
	         
	         
	         if (right==null)
	             return left;
	         
	         // same as helper array
	         // return node by preHead.next
	         // fakehead
	         ListNode preHead=new ListNode (-1);
	         
	         ListNode end=preHead;
	         
	         while(left!=null && right !=null){
	             if (left.val<right.val){
	                 end.next=left;
	                 left=left.next;
	             }
	             else{
	                 end.next=right;
	                 right=right.next;
	             }
	             
	             end=end.next;
	         }
	         // since in merge sort of linked list, each divided linked-list just contains one node and then null, so if the node is not inserted in it, then it is the larger one, which should be equal to 
	         if (left!=null){
	             end.next=left;
	         }
	         
	         if (right!=null){
	             end.next=right;
	         }
	         
	         
	         return preHead.next;
	     }
  
}