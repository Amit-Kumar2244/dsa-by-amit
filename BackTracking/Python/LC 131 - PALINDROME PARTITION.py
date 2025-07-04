# LEET CODE 131 - PALINDROME PARTITIONING
# QUESTION LINK - https://leetcode.com/problems/palindrome-partitioning/

class Solution:
    def isPalindrome(self, s, low, high):
        while low < high:
            if s[low] != s[high]:
                return False
            low += 1
            high -= 1
        return True

    def subStringPalindrome(self, res, s, temp, start):
        if start == len(s):
            res.append(temp[:])
            return

        for i in range(start, len(s)):
            if self.isPalindrome(s, start, i):
                temp.append(s[start:i+1])
                self.subStringPalindrome(res, s, temp, i + 1)
                temp.pop()

    def partition(self, s):
        res = []
        temp = []
        self.subStringPalindrome(res, s, temp, 0)
        return res
