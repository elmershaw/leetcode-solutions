/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        // int n = 0;
        // int m = 0;
        if (head == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        ListNode tmp = slow.next;
        slow.next = null;
        slow = tmp;
        while (slow != null) {
            tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tmp;
        }
        // System.out.println(prev.val);
        tmp = head;
        while(prev != null) {
            fast = tmp.next;
            slow = prev.next;
            tmp.next = prev;
            prev.next = fast;
            tmp = fast;
            prev = slow;
        }
        // return head;
    }
}
// @lc code=end

