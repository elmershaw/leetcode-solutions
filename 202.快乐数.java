import java.util.HashSet;
<<<<<<< HEAD
=======
import java.util.Set;
>>>>>>> cb5f86a (add solutions from home PC)

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
<<<<<<< HEAD
        Set<Integer> seen = new HashSet<>();
        //int n = 0;
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNextInt(n);
        }
        return n == 1;
    }

    private int getNextInt(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
=======
        Set<Integer> visited = new HashSet<>();
        visited.add(n);
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                int rmd = n % 10;
                sum += rmd * rmd;
                n = n / 10;
            }
            if (visited.contains(sum)) {
                return false;
            }
            n = sum;
            visited.add(sum);
        }
        return true;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

