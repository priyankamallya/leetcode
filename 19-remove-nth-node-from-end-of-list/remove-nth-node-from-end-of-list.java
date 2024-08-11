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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int rem = count-n;
        if(rem==0){
            head = head.next;
            return head;
        }
        temp = head;
        while(rem!=1){
            temp = temp.next;
            rem--;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
            return head;
        }
        temp.next=null;
        return head;
    }
}