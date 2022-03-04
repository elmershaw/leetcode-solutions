import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    private Deque<Integer> queue = new ArrayDeque<>();
    // private Deque<Integer> stack = new ArrayDeque<>();

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            add(nums[i]);
        }
        for (int j = k; j < nums.length; j++) {
            ans[j - k] = getMax();
            // System.out.println(queue.toString());
            remove(nums[j - k]);
            add(nums[j]);
        }
        ans[ans.length - 1] = getMax();
        return ans;
    }

    public int getMax() {
        return queue.getFirst();
    }

    public void remove(int x) {
        if (queue.peek() == x) {
            queue.removeFirst();
        }
    }

    public void add(int x) {
        while (!queue.isEmpty() && queue.peekLast() < x) {
            queue.removeLast();
        }
        queue.addLast(x);
    }

}
// @lc code=end
