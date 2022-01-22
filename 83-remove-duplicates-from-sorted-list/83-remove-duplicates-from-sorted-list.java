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
       public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){return head;}
        ListNode curr = head;
        ListNode nxt = curr.next;
        while(nxt!=null){
            if(curr.val==nxt.val){
                curr.next = nxt.next;
                nxt=nxt.next;
                continue;
            }
            curr = curr.next;
            nxt = nxt.next;
        }
        return head;
    }
}