import java.util.List;

/*
 * @lc app=leetcode.cn id=841 lang=java
 *
 * [841] 钥匙和房间
 */

// @lc code=start
class Solution {
    private int visited = 1;
    boolean[] enterable;


    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        enterable = new boolean[rooms.size()];
        enterable[0] = true;
        return visit(rooms, 0);
    }

    private boolean visit(List<List<Integer>> rooms, int room) {
        if (visited == rooms.size()) {
            return true;
        }
        List<Integer> keys = rooms.get(room);
        for (Integer key : keys) {
            if (!enterable[key]) {
                visited++;
                enterable[key] = true;
                if (visit(rooms, key)) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end

