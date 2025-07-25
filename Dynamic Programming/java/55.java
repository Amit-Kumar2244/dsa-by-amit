class Solution {
    public boolean canJump(int[] nums) {
        int reach = nums.length - 1;
        for (int i = reach; i >= 0; i--) {
            if (nums[i] + i >= reach) {
                reach = i;
            }
        }
        return reach == 0;
    }
}