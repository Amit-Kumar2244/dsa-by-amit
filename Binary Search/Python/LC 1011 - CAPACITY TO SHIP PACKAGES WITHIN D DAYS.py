# LEET CODE 1011 - Capacity To Ship Packages Within D Days
# QUESTION LINK - https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution:
    def canShip(self, weights, d, capacity):
        days = 1
        total = 0
        for weight in weights:
            if total + weight <= capacity:
                total += weight
            else:
                days += 1
                total = weight
        return days <= d

    def shipWithinDays(self, weights, days):
        low = max(weights)
        high = sum(weights)
        ans = high
        while low <= high:
            mid = (low + high) // 2
            if self.canShip(weights, days, mid):
                ans = mid
                high = mid - 1
            else:
                low = mid + 1
        return ans
