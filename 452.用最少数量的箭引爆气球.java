<<<<<<< HEAD
=======
import java.util.Arrays;

>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=452 lang=java
 *
 * [452] 用最少数量的箭引爆气球
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
<<<<<<< HEAD
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 1;
        //int r = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                ans++;
                //r = points[i][1];
            } else {
                points[i][1] = Math.min(points[i - 1][1], points[i][1]);
            }
        }
        return ans;
    }
}
// class Solution {
//     public int findMinArrowShots(int[][] points) {
//         if (points.length == 0) return 0;
//         Arrays.sort(points, (o1, o2) -> Integer.compare(o1[0], o2[0]));

//         int count = 1;
//         for (int i = 1; i < points.length; i++) {
//             if (points[i][0] > points[i - 1][1]) {
//                 count++;
//             } else {
//                 points[i][1] = Math.min(points[i][1],points[i - 1][1]);
//             }
//         }
//         return count;
//     }
// }
=======
        if (points.length == 0) return 0;
        Arrays.sort(points, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int arrows = 1;
        // int l = -1;
        // int r = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                arrows++;
            } else {
                points[i][1] = Math.min(points[i][1],points[i - 1][1]);
            }
        }
        return arrows;
    }
}
>>>>>>> cb5f86a (add solutions from home PC)
// @lc code=end

