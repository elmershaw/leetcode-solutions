import java.util.Arrays;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        // int[] sMap = new int[26];
        // Arrays.fill(sMap, -1);
        // int[] tMap = new int[26];
        // Arrays.fill(tMap, -1);
        for (int i = 0; i < s.length(); i++) {
            Character cFromS = map.getOrDefault(s.charAt(i), null);
            Character cFromT = map.getOrDefault(t.charAt(i), null);
            // System.out.println(cFromS);
            // System.out.println(cFromT);
            if (cFromS == null && cFromT == null) {
                map.put(s.charAt(i), t.charAt(i));
                map.put(t.charAt(i), s.charAt(i));
            } else if (cFromS != null && cFromT != null) {
                if (cFromS != t.charAt(i) || cFromT != s.charAt(i)) {
                    return false;
                }
            } else {
                return false;
            }
            // if (cFromS != t.charAt(i) || cFromT != s.charAt(i)) {
            //     return false;
            // }
            
            // int sIdx = s.charAt(i) - 'a';
            // int tIdx = t.charAt(i) - 'a';
            // if (sMap[sIdx] == -1 && tMap[tIdx] == -1) {
            //     sMap[sIdx] = tIdx;
            //     tMap[tIdx] = sIdx;
            // } else if (sMap[sIdx] != -1 && tMap[tIdx] != -1) {
            //     if (sMap[sIdx] != tIdx || tMap[tIdx] != sIdx) {
            //         return false;
            //     }
            // } else {
            //     return false;
            // }
        }
        return true;
    }
    // public boolean isIsomorphic(String s, String t) {
    //     Map<Character, Character> map1 = new HashMap<>();
    //     Map<Character, Character> map2 = new HashMap<>();
    //     for (int i = 0, j = 0; i < s.length(); i++, j++) {
    //         if (!map1.containsKey(s.charAt(i))) {
    //             map1.put(s.charAt(i), t.charAt(j)); // map1保存 s[i] 到 t[j]的映射
    //         }
    //         if (!map2.containsKey(t.charAt(j))) {
    //             map2.put(t.charAt(j), s.charAt(i)); // map2保存 t[j] 到 s[i]的映射
    //         }
    //         // 无法映射，返回 false
    //         if (map1.get(s.charAt(i)) != t.charAt(j) || map2.get(t.charAt(j)) != s.charAt(i)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
// @lc code=end

