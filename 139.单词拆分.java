import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //dp[i] = true means i could consist of wordDict
        //dp[i] = dp[i] | dp[split(i, wordDict[j])];
        //dp[""] = true;
        boolean[] dp = new boolean[s.length() + 1];
        Set<String> visited = new HashSet<>();
        visited.add("");
        for(String str : wordDict) {
            visited.add(str);
        }
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                //System.out.println(s.substring(i - j, i));
                if (visited.contains(s.substring(j, i)) && dp[j]) {
                    dp[i] = true;
                    visited.add(s.substring(0, i));
                }
            }
        }

        System.out.println(visited);

        return dp[s.length()];
        // boolean[] valid = new boolean[s.length() + 1];
        // valid[0] = true;
        // for (int i = 1; i <= s.length(); i++) {
        //     for (int j = 0; j < i; j++) {
        //         if (wordDict.contains(s.substring(j,i)) && valid[j]) {
        //             valid[i] = true;
        //         }
        //     }
        // }

        // return valid[s.length()];
    }
}
// @lc code=end

