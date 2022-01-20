/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
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
    public ListNode detectCycle(ListNode head) {
<<<<<<< HEAD
        ListNode slow = head;
        ListNode fast = head;
=======

        ListNode slow = head;
>>>>>>> cb5f86a (add solutions from home PC)
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
<<<<<<< HEAD
                slow = head;
=======
                fast = head;
>>>>>>> cb5f86a (add solutions from home PC)
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
// @lc code=end

