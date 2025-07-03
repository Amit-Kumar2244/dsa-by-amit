// LEET CODE 69 - SQUARE ROOT
// Question Link - https://leetcode.com/problems/sqrtx/description/

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        long low = 1;
        long high = x / 2;
        long mid = (low + high) / 2;
        long sol = 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid >= x) {
                high = mid - 1;
            } else {
                sol = mid;
                low = mid + 1;
            }
        }
        return (int) sol;
    }
}