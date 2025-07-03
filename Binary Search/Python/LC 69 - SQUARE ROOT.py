# LEET CODE 69 - SQUARE ROOT
# Question Link - https://leetcode.com/problems/sqrtx/description/

class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0:
            return 0
        low = 1
        high = x // 2
        mid = (low + high) // 2
        sol = 1

        while low <= high:
            mid = (low + high) // 2
            if mid * mid == x:
                return mid
            elif mid * mid >= x:
                high = mid - 1
            else:
                sol = mid
                low = mid + 1
        return sol
