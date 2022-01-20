/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 有效的山脉数组
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int l = 0;
        int r = arr.length - 1;
        while ((l < arr.length - 1 && arr[l] < arr[l + 1]) || (r > 0 && arr[r] < arr[r - 1])) {
            if (arr[l] < arr[l + 1]) {
                l++;
            }
            if (arr[r] < arr[r - 1]) {
                r--;
            }
        }
        return l == r && l != 0 && l != arr.length - 1;
    }
}
// @lc code=end

