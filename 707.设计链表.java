<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
<<<<<<< HEAD
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
=======
class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyLinkedList() {
        // length = 0;
        head = new Node(-1, null, null);
        tail = new Node(-1, null, head);
        head.next = tail;
    }

    public int get(int index) {
        if (index >= length) {
            return -1;
        }
        Node tmp = head.next;
        while (index-- > 0) {
            tmp = tmp.next;
        }
        return tmp.val;
    }

    public void addAtHead(int val) {
        Node tmp = new Node(val, head.next, head);
        head.next.prev = tmp;
        head.next = tmp;
        // head = tmp;
        length++;
    }

    public void addAtTail(int val) {
        Node tmp = new Node(val, tail, tail.prev);
        tail.prev.next = tmp;
        tail.prev = tmp;
        // tail = tmp;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        Node node = new Node(val, null, null);
        if (index <= 0) {
            addAtHead(val);
            // length++;
            return;
        }
        if (index == length) {
            addAtTail(val);
            return;
        }
        Node tmp = head.next;
        while (index-- > 0) {
            tmp = tmp.next;
        }
        node.next = tmp;
        node.prev = tmp.prev;
        tmp.prev = node;
        node.prev.next = node;
        length++;
    }

    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        }
        if (index == 0) {
            head.next = head.next.next;
            head.next.prev = head;
            length--;
            return;
        }
        if (index == length - 1) {
            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
            length--;
            return;
        }
        Node tmp = head.next;
        while (index-- > 0) {
            tmp = tmp.next;
        }
        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;
        length--;
>>>>>>> cb5f86a (add solutions from home PC)
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
<<<<<<< HEAD

=======
>>>>>>> cb5f86a (add solutions from home PC)
