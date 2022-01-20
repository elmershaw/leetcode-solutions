import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1207 lang=java
 *
 * [1207] 独一无二的出现次数
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Map<Integer, Integer> visited = new HashMap<>();
        // for (int i : arr) {
        //     //visited.compute(i, (k, v) -> (v == null) ? 1 : v + 1);
        //     visited.merge(i , 1, (v1, v2) -> v1 + v2);
        //     //System.out.printf("k: %d, v: %d\n", i, visited.get(i));
        // }
        // // System.out.println(visited.toString());
        // Set<Integer> nums = new HashSet<>();
        // Iterator<Map.Entry<Integer, Integer>> ite = visited.entrySet().iterator();
        // while (ite.hasNext()) {
        //     int tmp = ite.next().getValue();
        //     if (nums.contains(tmp)) {
        //         return false;
        //     }
        //     nums.add(tmp);
        // }
        // return true;
        int[] count = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] + 1000]++; // 防止负数作为下标
        }
        boolean[] flag = new boolean[1001]; // 标记相同频率是否重复出现
        for (int i = 0; i <= 2000; i++) {
            if (count[i] > 0) {
                if (flag[count[i]] == false) {
                    flag[count[i]] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

