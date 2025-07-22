class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int maxreached = 0;
        int reach = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxreached = Math.max(maxreached, nums[i] + i);
            if (i == reach) {
                jump++;
                reach = maxreached;
            }
        }
        return jump;
    }
}