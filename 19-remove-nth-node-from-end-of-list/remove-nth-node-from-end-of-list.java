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
        while(temp!=null){
            rem--;
            if(rem==0){
                break;
            }
            temp = temp.next;
        }
        ListNode delNode = temp;
        temp.next = temp.next.next;
        delNode = null;
        return head;
    }
}