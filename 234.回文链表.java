/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int times = 0;
        while (fast != null && fast.next != null) {
            times++;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode proc = slow.next;
        while (slow != null && proc != null) {
            ListNode tmp = proc.next;
            proc.next = slow;
            slow = proc;
            proc = tmp;
        }
        for (int i = 0; i < times; i++) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
// @lc code=end

