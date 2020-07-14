/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> newNum = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (newNum.containsKey(nums[i])) {
                int left = newNum.get(nums[i]);
                return new int[]{left, i};
            }
            else {
                newNum.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}
// @lc code=end

