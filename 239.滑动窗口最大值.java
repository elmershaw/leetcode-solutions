<<<<<<< HEAD
import java.util.PriorityQueue;
=======
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
>>>>>>> cb5f86a (add solutions from home PC)

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
<<<<<<< HEAD
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (x, y) -> y.compareTo(x));
        int[] ans = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (pq.size() < k) {
                pq.add(nums[i++]);
            }
            ans[index++] = pq.peek();
            pq.remove(nums[i - k]);
            i--;
        }
        return ans;
    }
}
// @lc code=end

=======
        // 只使用优先级队列会超时
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        MyQueue myQueue = new MyQueue();
        int j = 0;
        for (int i = 0; i < n; i++) {
            myQueue.push(nums[i]);
            if (i >= k - 1) {
                ans[j++] = myQueue.peekFirst();
                myQueue.pop(nums[i - k + 1]);
            }
        }
        return ans;
    }

    class MyQueue {
        private Deque<Integer> queue;

        MyQueue() {
            queue = new ArrayDeque<>();
        }

        public void push(int x) {
            while (!queue.isEmpty() && x > queue.peekLast()) {
                queue.removeLast();
            }
            queue.addLast(x);
            
        }

        public void pop(int x) {
            if (!queue.isEmpty() && peekFirst() == x) {
                queue.removeFirst();
            }
        }

        public int peekFirst() {
            return queue.peekFirst();
        }
    }
}
// @lc code=end
>>>>>>> cb5f86a (add solutions from home PC)
