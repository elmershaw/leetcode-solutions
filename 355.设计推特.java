import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=355 lang=java
 *
 * [355] 设计推特
 */

// @lc code=start
class Twitter {
    private Map<Integer, List<Integer>> tweets;
    private Map<Integer, List<Integer>> follow;

    public Twitter() {
        tweets = new HashMap<>();
        follow = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if (!tweets.containsKey(userId)) {
            List<Integer> newTweetList = new ArrayList<>();
            newTweetList.add(tweetId);
            tweets.put(userId, newTweetList);
        } else {
            tweets.get(userId).add(tweetId);
        }
    }
    
    public List<Integer> getNewsFeed(int userId) {
        
    }
    
    public void follow(int followerId, int followeeId) {
        if (!follow.containsKey(followerId)) {
            List<Integer> newFollowerList = new ArrayList<>();
            newFollowerList.add(followeeId);
            follow.put(followerId, newFollowerList);
        } else {
            follow.get(followerId).add(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        follow.get(followerId).remove((Integer.valueOf(followeeId)));
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
// @lc code=end

