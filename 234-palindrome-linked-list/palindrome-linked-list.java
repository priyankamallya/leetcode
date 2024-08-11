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
    public boolean isPalindrome(ListNode head) {
        //better approach
        //step 1 find the middle of the pallindrome or m1 for even number of nodes
        if(head.next==null || head==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //step 2 reverse the second half
        ListNode newHead = reverse(slow.next);
        //step 3 compare the two halves
        ListNode temp2 = newHead;
        ListNode temp1 = head;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                reverse(newHead);
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}