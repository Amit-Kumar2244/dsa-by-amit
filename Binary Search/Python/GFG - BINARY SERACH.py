# GFG - Binary Search
# QUESTION LINK - https://www.geeksforgeeks.org/problems/binary-search-1587115620/1

class Solution:
    def binarysearch(self, arr, k):
        low = 0
        high = len(arr) - 1
        ans = -1

        while low <= high:
            mid = low + (high - low) // 2
            if arr[mid] == k:
                ans = mid
                high = mid - 1  # For first occurrence
            elif arr[mid] > k:
                high = mid - 1
            else:
                low = mid + 1

        return ans
