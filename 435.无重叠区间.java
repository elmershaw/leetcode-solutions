import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=435 lang=java
 *
 * [435] 无重叠区间
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
<<<<<<< HEAD
        if (intervals.length < 2) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        int r = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (r > intervals[i][0]) {
                ans++;
                //r = intervals[i][1];
                r = Math.min(r, intervals[i][1]);
            } else {
                r = intervals[i][1];
            }
        }
        return ans;
    }
}
// class Solution {
//     public int eraseOverlapIntervals(int[][] intervals) {
//         if (intervals.length < 2) return 0;

//         Arrays.sort(intervals, new Comparator<int[]>() {
//             @Override
//             public int compare(int[] o1, int[] o2) {
//                 if (o1[1] != o2[1]) {
//                     return Integer.compare(o1[1],o2[1]);
//                 } else {
//                     return Integer.compare(o1[0],o2[0]);
//                 }
//             }
//         });

//         int count = 1;
//         int edge = intervals[0][1];
//         for (int i = 1; i < intervals.length; i++) {
//             if (edge <= intervals[i][0]){
//                 count ++; //non overlap + 1
//                 edge = intervals[i][1];
//             }
//         }
//         return intervals.length - count;
//     }
// }
=======
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int ans = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[i - 1][1]) ans++;
            else {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
            }
        }
        return intervals.length - ans;
    }
}
>>>>>>> cb5f86a (add solutions from home PC)
// @lc code=end

