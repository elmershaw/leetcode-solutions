/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
<<<<<<< HEAD
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
=======
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
>>>>>>> cb5f86a (add solutions from home PC)
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
<<<<<<< HEAD
        ListNode firCur = head;
        ListNode dummy = head;
        while (firCur != null && firCur.next != null) {
            dummy = firCur.next.next;
            firCur.next = firCur;
        }
    }
}
// @lc code=end

=======
        ListNode prev = null;
        ListNode cursor = head;
        // prev.next = null;
        while (cursor != null) {
            ListNode tmp = cursor.next;
            cursor.next = prev;
            prev = cursor;
            cursor = tmp;
        }
        return prev;
    }
}
// @lc code=end
>>>>>>> cb5f86a (add solutions from home PC)
