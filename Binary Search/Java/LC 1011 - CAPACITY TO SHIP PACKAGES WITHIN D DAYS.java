// LEET CODE 1011 - Capacity To Ship Packages Within D Days
// QUESTION LINK - https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {
    
    private boolean canShip(int[] weights, int d, int mid) {
        int sum = 0, days = 1;

        for (int weight : weights) {
            if (sum + weight <= mid) {
                sum += weight;
            } else {
                days++;
                sum = weight;
            }
        }

        return days <= d;
    }

    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, max = weights[0], ans = 0;

        for (int weight : weights) {
            if (weight > max) {
                max = weight;
            }
            sum += weight;
        }

        int low = max, high = sum;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canShip(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
