/*
 * @lc app=leetcode.cn id=203 lang=golang
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeElements(head *ListNode, val int) *ListNode {
	dummy := &ListNode{0, head}
	cursor := dummy
	for cursor != nil && cursor.Next != nil {
		if cursor.Next.Val == val {
			cursor.Next = cursor.Next.Next
			continue
		}
		cursor = cursor.Next
	}
	return dummy.Next
}

// @lc code=end

