<<<<<<< HEAD
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
=======
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
>>>>>>> cb5f86a (add solutions from home PC)

/*
 * @lc app=leetcode.cn id=406 lang=java
 *
 * [406] 根据身高重建队列
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });

<<<<<<< HEAD
        List<int[]> que = new LinkedList<>();
=======
        LinkedList<int[]> que = new LinkedList<>();
>>>>>>> cb5f86a (add solutions from home PC)

        for (int[] p : people) {
            que.add(p[1],p);
        }

        return que.toArray(new int[people.length][]);
    }
}
// @lc code=end

