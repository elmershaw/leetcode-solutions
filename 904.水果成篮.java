/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        int fir = -1, sec = -1;
        int n = fruits.length;
        int firSum = 0, secSum = 0;
        int firp = 0, secp = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (fir == -1 || sec == -1) {
                if (fir == -1)
                    fir = fruits[i];
                else 
                    sec = fruits[i];
            }
            if (fir == fruits[i]) {
                if (i > 0 && fruits[i - 1] != fruits[i]) firp = i;
                firSum++;
                continue;
            }
            if (sec  == fruits[i]) {
                if (fruits[i - 1] != fruits[i]) secp = i;
                secSum++;
                continue;
            }
            res = Math.max(res, firSum + secSum);
            if (fruits[i - 1] == fir) {
<<<<<<< HEAD
                firSum = i - 1 - firp + 1;
=======
                firSum = i - firp;
>>>>>>> cb5f86a (add solutions from home PC)
                sec = fruits[i];
                secSum = 1;
                secp = i;
            } else {
<<<<<<< HEAD
                secSum = i - 1 - secp + 1;
=======
                secSum = i - secp;
>>>>>>> cb5f86a (add solutions from home PC)
                fir = fruits[i];
                firSum = 1;
                firp = i;
            }
        }
<<<<<<< HEAD
        //if (res == 0) return n;
=======
>>>>>>> cb5f86a (add solutions from home PC)
        res = Math.max(res, firSum + secSum);
        return res;
    }
}
// @lc code=end
<<<<<<< HEAD

=======
>>>>>>> cb5f86a (add solutions from home PC)
