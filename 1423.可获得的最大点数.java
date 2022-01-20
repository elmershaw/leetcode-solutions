import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1423 lang=java
 *
 * [1423] 可获得的最大点数
 */

// @lc code=start
class Solution {
    private int[] calculated;
    private int bitmask = 0;
    private int bitmaskLength;

    public int maxScore(int[] cardPoints, int k) {
        //dp?
        //
        if (k == 0 || cardPoints == null) {
            return 0;
        }
        
        int n = cardPoints.length;
        if (k >= n) {
            return Arrays.stream(cardPoints).sum();
        }
        bitmaskLength = k;
        calculated = new int[(int)Math.pow(2, k)];
        pick(1, k);
        calculated[bitmask] = chose(cardPoints, k - 1, 1, n - 1) + cardPoints[0];
        pick(0, k);
        pick(0, k);
        calculated[bitmask] = chose(cardPoints, k - 1, 0, n - 2) + cardPoints[n - 1];
        pick(1, k);
        return calculated[0] > calculated[1] ? calculated[0] : calculated[1];
    }

    private int chose(int[] cardPoints, int k, int l, int r) {
        if (k == 0) {
            return 0;
        }
        if (l == r) {
            return cardPoints[l];
        }
        int pickL = 0, pickR = 0;
        pick(1, k);
        if (calculated[bitmask] != 0) pickL = calculated[bitmask];
        else pickL = chose(cardPoints, k - 1, l + 1, r) + cardPoints[l];
        pick(0, k);
        pick(0, k);
        if (calculated[bitmask] != 0) pickR = calculated[bitmask];
        else pickR = chose(cardPoints, k - 1, l, r - 1) + cardPoints[r];
        pick(1, k);
        return pickL > pickR ? pickL : pickR;
    }

    private void pick(int bit, int k) {
        bitmask |= bit << (bitmaskLength - k);
    }
}
// @lc code=end

