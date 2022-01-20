import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {
    private Deque<Integer> stackIn;
    private Deque<Integer> stackOut;
    // boolean entry;

    public MyQueue() {
        stackIn = new ArrayDeque<>();
        stackOut = new ArrayDeque<>();
        // entry = true;
    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        if (stackOut.isEmpty()) {
            while (stackIn.size() > 0) {
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }
    
    public int peek() {
        int res = pop();
        stackOut.push(res);
        return res;
    }
    
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

