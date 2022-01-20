/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
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
    public ListNode swapPairs(ListNode head) {
<<<<<<< HEAD
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1, head.next);
        ListNode prev = dummy;
        ListNode cur = head;
        ListNode proc = head.next;
        // ListNode cur = head.next;
        // ListNode prev = head;
        while (cur != null && proc != null) {
            ListNode tmp = proc.next;
            proc.next = cur;
            cur.next = tmp;
            prev.next = proc;
            prev = cur;
            cur = tmp;
            proc = cur != null ? cur.next : null;
=======
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode next = head.next;
        while (curr != null && next != null) {
            ListNode tmp = next.next;
            prev.next = next;
            next.next = curr;
            curr.next = tmp;
            prev = curr;
            curr = tmp;
            next = curr == null ? null : curr.next;
>>>>>>> cb5f86a (add solutions from home PC)
        }
        return dummy.next;
    }
}
// @lc code=end

