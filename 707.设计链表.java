import java.util.List;

/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
}

class MyLinkedList {
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        head = new ListNode();
        tail = head;
    }
    
    public int get(int index) {
        ListNode cursor = head;
        for (int i = 0; i < index - 1; i++) {
            if (cursor == null) return -1;
            cursor = cursor.next;
        }
        return cursor.val;
    }
    
    public void addAtHead(int val) {
        ListNode node = new ListNode(val, head);
        head = node;
    }
    
    public void addAtTail(int val) {
        tail.next = new ListNode(val, null);
        tail = tail.next;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 1) addAtHead(val);
        ListNode cursor = head;
        for (int i = 0; i < index - 2; i++) {
            if (cursor == null) return;
            cursor = cursor.next;
        }
        ListNode node = new ListNode(val, null);
        node.next = cursor.next;
        cursor.next = node;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0) return;
        ListNode cursor = head;
        for (int i = 0; i < index - 2; i++) {
            if (cursor == null) return;
            cursor = cursor.next;
        }
        if (cursor.next != null)
            cursor.next = cursor.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

