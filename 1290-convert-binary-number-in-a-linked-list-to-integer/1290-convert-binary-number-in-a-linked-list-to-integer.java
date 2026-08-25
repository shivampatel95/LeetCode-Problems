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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int num=0;
        while(temp!=null){
            num=num+(temp.val)*(int)Math.pow(2,count-1);
            count--;
            temp=temp.next;
        }
        return num;
    }
}