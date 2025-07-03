// LEET CODE 875 - Koko Eating Bananas
// QUESTION LINK - https://leetcode.com/problems/koko-eating-bananas/

class Solution {

    private boolean canEatAll(int[] piles, int h, long speed) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed; // ceiling without using Math.ceil
        }
        return totalHours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }

        int low = 1, high = max;
        int ans = max;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canEatAll(piles, h, mid)) {
                ans = (int) mid;
                high = (int) mid - 1;
            } else {
                low = (int) mid + 1;
            }
        }

        return ans;
    }
}
