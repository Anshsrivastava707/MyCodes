/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;

        int l=1;
        ListNode tail=head;

        while(tail.next!=null){
            tail=tail.next;
            l=l+1;
        }

        tail.next=head;
        k=k%l;

        int newIndex=l-k;

        ListNode ntail=head;
        for(int i=1;i<newIndex;i++){
            ntail=ntail.next;
        }
        
        ListNode nhead=ntail.next;
          ntail.next = null; 
        return nhead;
    }
}