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
        // 1. Edge Case Check: Handle empty list, single element, or no rotations
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head; 
        ListNode mew = head; 
        int len = 0; 
        
        while (temp != null) { 
            temp = temp.next; 
            len++; 
        } 
        
        k %= len; 
        // 2. Optimization: If k becomes 0 after modulo, no rotation is needed
        if (k == 0) {
            return head;
        }

        temp = head; 
        while (temp.next != null) { 
            temp = temp.next; 
        } 
        
        ListNode tail = temp; 
        temp = head; 
        
        for (int i = 0; i < len - k - 1; i++) { 
            temp = temp.next; 
        } 
        
        mew = temp.next; 
        temp.next = null; 
        tail.next = head; 
        
        return mew; 
    } 
}
