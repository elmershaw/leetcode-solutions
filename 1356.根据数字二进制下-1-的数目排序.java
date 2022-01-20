import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode.cn id=1356 lang=java
 *
 * [1356] 根据数字二进制下 1 的数目排序
 */

// @lc code=start
class Solution {
    public int[] sortByBits(int[] arr) {
        
        arr = Arrays.stream(arr).boxed()
        .sorted((x, y) -> Integer.bitCount(x) == Integer.bitCount(y) ? x.compareTo(y) : Integer.bitCount(x) - Integer.bitCount(y))
        .mapToInt(i -> i).toArray();
        return arr;
    }
}
// @lc code=end

