/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        if(A==null || B==null){
            return null;
        }
        ListNode h1=A;
        ListNode h2=B;
        while(h1!=h2){
            h1=h1==null?B:h1.next;
            h2=h2==null?A:h2.next;
        }
        return h1;

        
    }
}