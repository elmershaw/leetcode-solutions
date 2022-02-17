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
        int n = 0;
        ListNode cursor = head;
        while (cursor != null) {
            n++;
            cursor = cursor.next;
        }
        if (n <= 1) return true;
        int h = n >> 1;
        cursor = head;
        ListNode prev = null;
        ListNode right = null;
        while (h-- > 0) {
            right = cursor.next;
            cursor.next = prev;
            prev = cursor;
            cursor = right;
        }
        if (n % 2 == 1) right = right.next;
        while (prev != null) {
            if (prev.val != right.val) return false;
            prev = prev.next;
            right = right.next;
        }
        return true;
    }
}
// @lc code=end

