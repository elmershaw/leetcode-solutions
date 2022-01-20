/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0, head);
        ListNode cursor = dummy;
        while (cursor != null && cursor.next != null) {
            if (cursor.next.val == val) {
                cursor.next = cursor.next.next;
                continue;
            }
            cursor = cursor.next;
        }
        return dummy.next;
    }
}
// @lc code=end

