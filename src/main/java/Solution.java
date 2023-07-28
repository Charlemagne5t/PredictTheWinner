public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        Integer[][][] memo = new Integer[nums.length][nums.length][2];
        return dfs(nums, 0, nums.length - 1, 0, memo) >= 0;
    }

    private int dfs(int[] nums, int left, int right, int move, Integer[][][] memo) {
        if (left > right) {
            return 0;
        }
        if (memo[left][right][move] != null) {
            return memo[left][right][move];
        }

        int result = 0;
        if (move == 0) {
            result = Math.max(dfs(nums, left + 1, right, 1, memo) + nums[left], dfs(nums, left, right - 1, 1, memo) + nums[right]);
        }
        if (move == 1) {
            result = Math.min(dfs(nums, left + 1, right, 0, memo) - nums[left], dfs(nums, left, right - 1, 0, memo) - nums[right]);
        }
        memo[left][right][move] = result;
        return result;
    }
}
