class Solution:
    def sum(self, arr, n):
        if n <= 0:
            return 0
        return arr[n - 1] + self.sum(arr, n - 1)

    def arraySum(self, arr):
        n = len(arr)
        return self.sum(arr, n)