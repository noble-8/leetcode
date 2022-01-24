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
    public ListNode reverseList(ListNode head) {
        ListNode prv = null;
        ListNode temp = null;
        while(head!=null){
            temp = head.next;
            head.next = prv;
            prv = head;
            head = temp;
        }
        return prv;
        
    }
}