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
    public boolean hasCycle(ListNode head) {
        ListNode a1=head;
        ListNode a2=head;
        while(a1!=null &&a1.next!=null){
            a1=a1.next.next;
            a2=a2.next;
            if(a1==a2){
                return true;
            }
        }
        return false;
        
    }
}