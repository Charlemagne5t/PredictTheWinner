import java.util.Arrays;

class Solution {
    public boolean predictTheWinner(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int score1 = dfs(nums, 0, nums.length - 1, 0, 0);
        int score2 = total - score1;
        return score1 >= score2 ;
    }

    int dfs(int[] nums, int l, int r, int turn, int score1) {
        if(l > r) {
            return score1;
        }

        if(turn == 0) {
            int takeL = dfs(nums, l + 1, r, 1, score1 + nums[l]);
            int takeR = dfs(nums, l, r - 1, 1, score1 + nums[r]);
            return Math.max(takeL, takeR);
        }else {
            int takeL = dfs(nums, l + 1, r, 0, score1);
            int takeR = dfs(nums, l, r - 1, 0, score1);
            return Math.min(takeL, takeR);
        }

    }
}