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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while(temp2!=null){
            int a = temp1.val;
            int b = temp2.val;
            int gcd = findGCD(a,b);
            ListNode node = new ListNode(gcd);
            temp1.next=node;
            node.next=temp2;
            temp1 = temp1.next.next;
            temp2 = temp2.next;
        }
        return head;
    }
    public int findGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a= temp; 
        }
        return a;
    }
}