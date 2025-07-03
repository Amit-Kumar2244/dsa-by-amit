# LEET CODE 875 - Koko Eating Bananas
# QUESTION LINK - https://leetcode.com/problems/koko-eating-bananas/

class Solution:
    def canEatAll(self, piles, h, speed):
        hours = 0
        for pile in piles:
            hours += (pile + speed - 1) // speed  # ceil equivalent
        return hours <= h

    def minEatingSpeed(self, piles, h):
        low, high = 1, max(piles)
        ans = high
        while low <= high:
            mid = (low + high) // 2
            if self.canEatAll(piles, h, mid):
                ans = mid
                high = mid - 1
            else:
                low = mid + 1
        return ans
