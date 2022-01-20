import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Arrays;
>>>>>>> cb5f86a (add solutions from home PC)
import java.util.List;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
<<<<<<< HEAD
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int l = intervals[0][0];
        int r = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > intervals[i - 1][1]) {
                ans.add(new int[]{l, intervals[i - 1][1]});
                l = intervals[i][0];
            } else {
                intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
            }
        }
        ans.add(new int[]{l, intervals[intervals.length - 1][1]});
        return ans.toArray(new int[ans.size()][]);
=======
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int l = intervals[0][0];
        int r = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > r) {
                ans.add(List.of(l, r));
                l = intervals[i][0];
                r = intervals[i][1];
                continue;
            }
            r = Math.max(r, intervals[i][1]);
        }
        ans.add(List.of(l, r));
        return ans.stream().map(list -> list.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

