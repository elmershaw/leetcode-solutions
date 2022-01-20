/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
<<<<<<< HEAD
        for (int i = 0; i< bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
=======
        // int twenty = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) five++;
            else if (bills[i] == 10) {
>>>>>>> cb5f86a (add solutions from home PC)
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
<<<<<<< HEAD
                
=======
>>>>>>> cb5f86a (add solutions from home PC)
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
<<<<<<< HEAD
                } else if (five > 2) {
=======
                } else if (five >= 3) {
>>>>>>> cb5f86a (add solutions from home PC)
                    five -= 3;
                } else {
                    return false;
                }
<<<<<<< HEAD
                
=======
>>>>>>> cb5f86a (add solutions from home PC)
            }
        }
        return true;
    }
}
// @lc code=end

