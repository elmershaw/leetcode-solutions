import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    private Deque<Integer> mainQueue;
    // private Deque<Integer> backQueue;

    public MyStack() {
        mainQueue = new ArrayDeque<>();
        // backQueue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        mainQueue.offer(x);
    }
    
    public int pop() {
        // while (mainQueue.size() > 1) {
        //     backQueue.offer(mainQueue.poll());
        // }
        // int res = mainQueue.poll();
        // while (!backQueue.isEmpty()) {
        //     mainQueue.offer(backQueue.poll());
        // }
        // return res;
        int n = mainQueue.size();
        for (int i = 0; i < n - 1; i++) {
            mainQueue.offer(mainQueue.poll());
        }
        return mainQueue.poll();
    }
    
    public int top() {
        int res = pop();
        push(res);
        return res;
    }
    
    public boolean empty() {
        return mainQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

