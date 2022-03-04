/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if (n == 0) return n;
        int i = 0;
        int ans = 1;
        int fir = fruits[0];
        int sec = -1;
        int firP = 0;
        int secP = 0;
        for (int j = 1; j < n; j++) {
            if (sec < 0 && fir != fruits[j]) {
                sec = fruits[j];
                secP = j;
            }
            if (fruits[j] != fir && fruits[j] != sec) {
                ans = Math.max(ans, j - i);
                if (fruits[j - 1] == fir) {
                    i = secP + 1;
                    sec = fruits[j];
                    secP = j;
                } else {
                    i = firP + 1;
                    fir = fruits[j];
                    firP = j;
                }
                // continue;
            } else if (fruits[j] == fir) {
                firP = j;
            } else {
                secP = j;
            }
        }
        return Math.max(ans, n - i);
        // int fir = -1, sec = -1;
        // int n = fruits.length;
        // int firSum = 0, secSum = 0;
        // int firp = 0, secp = 0;
        // int res = 0;
        // for (int i = 0; i < n; i++) {
        //     if (fir == -1 || sec == -1) {
        //         if (fir == -1)
        //             fir = fruits[i];
        //         else 
        //             sec = fruits[i];
        //     }
        //     if (fir == fruits[i]) {
        //         if (i > 0 && fruits[i - 1] != fruits[i]) firp = i;
        //         firSum++;
        //         continue;
        //     }
        //     if (sec  == fruits[i]) {
        //         if (fruits[i - 1] != fruits[i]) secp = i;
        //         secSum++;
        //         continue;
        //     }
        //     res = Math.max(res, firSum + secSum);
        //     if (fruits[i - 1] == fir) {
        //         firSum = i - firp;
        //         sec = fruits[i];
        //         secSum = 1;
        //         secp = i;
        //     } else {
        //         secSum = i - secp;
        //         fir = fruits[i];
        //         firSum = 1;
        //         firp = i;
        //     }
        // }
        // res = Math.max(res, firSum + secSum);
        // return res;
    }
}
// @lc code=end
